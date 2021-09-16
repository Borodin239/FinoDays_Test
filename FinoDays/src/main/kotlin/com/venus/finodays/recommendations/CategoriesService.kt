package com.venus.finodays.recommendations

import org.springframework.stereotype.Service

@Service
class CategoriesService {
    private val kTopCategories = listOf(
        Category("Test1", "https://e7.pngegg.com/pngimages/718/1015/png-clipart-linkedin-social-media-computer-icons-social-networking-service-microsoft-coin-blue-angle.png"),
        Category("Test2", "https://e7.pngegg.com/pngimages/718/1015/png-clipart-linkedin-social-media-computer-icons-social-networking-service-microsoft-coin-blue-angle.png"),
        Category("Test3", "https://e7.pngegg.com/pngimages/718/1015/png-clipart-linkedin-social-media-computer-icons-social-networking-service-microsoft-coin-blue-angle.png"),
        Category("Test4", "https://e7.pngegg.com/pngimages/718/1015/png-clipart-linkedin-social-media-computer-icons-social-networking-service-microsoft-coin-blue-angle.png"),
        Category("Test5", "https://e7.pngegg.com/pngimages/718/1015/png-clipart-linkedin-social-media-computer-icons-social-networking-service-microsoft-coin-blue-angle.png"),
        Category("Test6", "https://e7.pngegg.com/pngimages/718/1015/png-clipart-linkedin-social-media-computer-icons-social-networking-service-microsoft-coin-blue-angle.png"),
        Category("Test7", "https://e7.pngegg.com/pngimages/718/1015/png-clipart-linkedin-social-media-computer-icons-social-networking-service-microsoft-coin-blue-angle.png"),
        Category("Test8", "https://e7.pngegg.com/pngimages/718/1015/png-clipart-linkedin-social-media-computer-icons-social-networking-service-microsoft-coin-blue-angle.png"),
        Category("Test9", "https://e7.pngegg.com/pngimages/718/1015/png-clipart-linkedin-social-media-computer-icons-social-networking-service-microsoft-coin-blue-angle.png")
    )

    fun getTopCategories(count: Int = 5): List<Category> {
        return kTopCategories.subList(0, count)
    }
}