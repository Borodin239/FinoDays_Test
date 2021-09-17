package com.venus.finodays.recommendations

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin("http://localhost:8080")
@RequestMapping("/api/recommendations/{userId}")
class RecommendationsController {

    @Autowired
    private lateinit var actionsService: ActionsService

    @Autowired
    private lateinit var categoriesService: CategoriesService

    @GetMapping("/top_categories")
    fun getTopCategories(
        @PathVariable userId: Int?,
        @RequestParam count: Int?
    ): ResponseEntity<List<Category>> {
        if (userId == null)
            return ResponseEntity.notFound().build()

        return ResponseEntity.ok(categoriesService.getTopCategories(userId, count ?: 5))
        // todo: нормальная обработка (deniskorotchenko)
    }

    @GetMapping("/actions")
    fun getActions(
        @PathVariable userId: Int?
    ): ResponseEntity<List<Action>> {
        if (userId == null)
            return ResponseEntity.notFound().build()

        return ResponseEntity.ok(actionsService.getActions(userId))
        // todo: нормальная обработка (deniskorotchenko)
    }
}
