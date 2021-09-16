package com.venus.finodays.recommendations

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/recommendations/")
class RecommendationsController {

    @Autowired
    private lateinit var categoriesService: CategoriesService

    @GetMapping("/top_categories")
    fun getTopCategories(
        @RequestParam count: Int?
    ): List<Category> {
        return categoriesService.getTopCategories(count ?: 5)
        // todo: нормальная обработка (deniskorotchenko)
    }
}