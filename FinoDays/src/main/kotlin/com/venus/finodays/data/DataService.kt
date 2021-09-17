package com.venus.finodays.data

import com.venus.finodays.recommendations.CategoriesService

interface DataService {
    fun size(userId: Int): Int

    fun countSpended(userId: Int): Map<CategoriesService.CategoryNames, Double>

    fun countPotentialCashback(userId: Int): Map<CategoriesService.CategoryNames, Long>
}