package com.venus.finodays.data

import com.venus.finodays.recommendations.CategoriesService
import org.apache.commons.csv.CSVFormat
import org.apache.commons.csv.CSVParser
import java.nio.file.Files
import java.text.DateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.io.path.ExperimentalPathApi
import kotlin.io.path.toPath

class TableDataServiceImpl : DataService {

    val data = readCSV()

    @OptIn(ExperimentalPathApi::class)
    fun readCSV(): Map<Int, List<TransactionsRecord>> {
        val reader = Files.newBufferedReader(javaClass.classLoader.getResource("data.csv").toURI().toPath())
        val csvParser = CSVParser(reader, CSVFormat.EXCEL)
        val result = mutableMapOf<Int, MutableList<TransactionsRecord>>()
        val records = csvParser.records.drop(1)
        for (record in records) {
            val clientId = record.get(0).toLong()

            val r4splitted = record.get(4).split(',')
            val r = TransactionsRecord(
                clientId,
                record.get(1).toLong(),
                record.get(2) == "да" || record.get(2) == "Да",
                LocalDate.parse(record.get(3), DateTimeFormatter.ofPattern("dd.MM.yyyy")),
                r4splitted[0].toLong(),
                r4splitted[1].toInt(),
                MoneyCurrency.valueOf(record.get(5)),
                record.get(6),
                record.get(7).toLongOrNull() ?: 0,
                record.get(8)
            )
            if (result.containsKey(clientId.toInt())) {
                result[clientId.toInt()]?.add(r)
            } else {
                result[clientId.toInt()] = mutableListOf(r)
            }
        }
        return result
    }

    override fun countPotentialCashback(userId: Int): Map<CategoriesService.CategoryNames, Long> {
        val counts = mutableMapOf<CategoriesService.CategoryNames, Long>()
        for (category in CategoriesService.CategoryNames.values())
            counts[category] = 0
        for (record in data[userId] ?: emptyList()) {
            val category = CategoriesService.fromMMC(record.MMC)
            val value: Double = record.transactionSumL * 0.01 + record.transactionSumH
            // floor here v
            counts[category] = counts.getOrDefault(category, 0) - (value * 0.05).toLong()
        }

        return counts
    }

    override fun size(userId: Int): Int {
        return data[userId]?.size ?: 0
    }

    override fun countSpended(userId: Int): Map<CategoriesService.CategoryNames, Double> {
        val counts = mutableMapOf<CategoriesService.CategoryNames, Double>()
        for (category in CategoriesService.CategoryNames.values())
            counts[category] = 0.0
        for (record in data[userId] ?: emptyList()) {
            val category = CategoriesService.fromMMC(record.MMC)
            val value: Double = record.transactionSumL * 0.01 + record.transactionSumH
            counts[category] = counts.getOrDefault(category, 0).toDouble() - value
        }

        return counts
    }
}