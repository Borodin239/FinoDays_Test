package com.venus.finodays.expenses

import com.venus.finodays.data.DataService
import com.venus.finodays.recommendations.CategoriesService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import kotlin.math.roundToLong

@RestController
@CrossOrigin("http://localhost:8080")
@RequestMapping("{userId}/expenses")
class ExpensesController {
    @Autowired
    private lateinit var dataService: DataService

    @CrossOrigin("http://localhost:8080")
    @GetMapping("")
    fun getExpenses(@PathVariable userId: Int?): ResponseEntity<List<Expense>> {
        if (userId == null)
            return ResponseEntity.notFound().build()

        val counts = dataService.countSpended(userId)
        val ans = counts.toList().filter { p -> p.first != CategoriesService.CategoryNames.TRANSFERS }. map {
            p -> Expense(p.first.value, p.second.roundToLong())
        }.toList()
        return ResponseEntity.ok(ans)
    }
}