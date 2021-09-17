package com.venus.finodays.data

data class TransactionsRecord (
    val clientId: Long,
    val cardId: Long,
    val isCredit: Boolean,
    val date: String,
    val transactionSumH: Long,
    val transactionSumL: Int,
    val currency: MoneyCurrency,
    val transactionText: String,
    val MMC: Long,
    val MMCTest: String)
