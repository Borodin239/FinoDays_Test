package com.venus.finodays.data

import java.time.LocalDate
import java.util.*

data class TransactionsRecord (
    val clientId: Long,
    val cardId: Long,
    val isCredit: Boolean,
    val date: LocalDate,
    val transactionSumH: Long,
    val transactionSumL: Int,
    val currency: MoneyCurrency,
    val transactionText: String,
    val MMC: Long,
    val MMCTest: String)
