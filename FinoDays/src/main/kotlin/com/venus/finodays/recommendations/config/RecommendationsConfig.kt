package com.venus.finodays.recommendations.config

import com.venus.finodays.data.DataService
import com.venus.finodays.data.TableDataServiceImpl
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class RecommendationsConfig {
    @Bean
    fun dataService(): DataService {
        return TableDataServiceImpl()
    }
}