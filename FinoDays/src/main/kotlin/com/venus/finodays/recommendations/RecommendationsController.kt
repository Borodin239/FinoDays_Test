package com.venus.finodays.recommendations

import org.elasticsearch.client.Response
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.client.HttpClientErrorException
import org.springframework.web.client.HttpServerErrorException
import javax.websocket.server.PathParam

@RestController
@RequestMapping("/recommendations/{user_id}/")
class RecommendationsController() {

    @Autowired
    private lateinit var categoriesService: CategoriesService

    @GetMapping("/top_categories")
    fun getTopCategories(
        @PathVariable("user_id") userId: Int?,
        @RequestParam count: Int?
    ): ResponseEntity<List<Category>> {
        if (userId == null)
            return ResponseEntity.notFound().build()

        return ResponseEntity.ok(categoriesService.getTopCategories(userId, count ?: 5))
        // todo: нормальная обработка (deniskorotchenko)
    }

    @GetMapping("/actions")
    fun getActions(): List<Action> {
        return emptyList()
        // todo: нормальная обработка (deniskorotchenko)
    }
}