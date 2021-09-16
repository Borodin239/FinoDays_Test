package com.venus.finodays.recommendations

import org.springframework.stereotype.Service
import java.lang.Integer.min

@Service
class CategoriesService {
    private val kTopCategories = mapOf<Int, List<Category>>(
        1 to listOf(
            Category("Test1_1", "https://e7.pngegg.com/pngimages/718/1015/png-clipart-linkedin-social-media-computer-icons-social-networking-service-microsoft-coin-blue-angle.png"),
            Category("Test1_2", "https://e7.pngegg.com/pngimages/718/1015/png-clipart-linkedin-social-media-computer-icons-social-networking-service-microsoft-coin-blue-angle.png"),
            Category("Test1_3", "https://e7.pngegg.com/pngimages/718/1015/png-clipart-linkedin-social-media-computer-icons-social-networking-service-microsoft-coin-blue-angle.png"),
            Category("Test1_4", "https://e7.pngegg.com/pngimages/718/1015/png-clipart-linkedin-social-media-computer-icons-social-networking-service-microsoft-coin-blue-angle.png"),
            Category("Test1_5", "https://e7.pngegg.com/pngimages/718/1015/png-clipart-linkedin-social-media-computer-icons-social-networking-service-microsoft-coin-blue-angle.png"),
            Category("Test1_6", "https://e7.pngegg.com/pngimages/718/1015/png-clipart-linkedin-social-media-computer-icons-social-networking-service-microsoft-coin-blue-angle.png"),
            Category("Test1_7", "https://e7.pngegg.com/pngimages/718/1015/png-clipart-linkedin-social-media-computer-icons-social-networking-service-microsoft-coin-blue-angle.png"),
            Category("Test1_8", "https://e7.pngegg.com/pngimages/718/1015/png-clipart-linkedin-social-media-computer-icons-social-networking-service-microsoft-coin-blue-angle.png"),
            Category("Test1_9", "https://e7.pngegg.com/pngimages/718/1015/png-clipart-linkedin-social-media-computer-icons-social-networking-service-microsoft-coin-blue-angle.png")
        ),
        2 to listOf(
            Category("Test2_1", "https://e7.pngegg.com/pngimages/718/1015/png-clipart-linkedin-social-media-computer-icons-social-networking-service-microsoft-coin-blue-angle.png"),
            Category("Test2_2", "https://e7.pngegg.com/pngimages/718/1015/png-clipart-linkedin-social-media-computer-icons-social-networking-service-microsoft-coin-blue-angle.png"),
            Category("Test2_3", "https://e7.pngegg.com/pngimages/718/1015/png-clipart-linkedin-social-media-computer-icons-social-networking-service-microsoft-coin-blue-angle.png"),
            Category("Test2_4", "https://e7.pngegg.com/pngimages/718/1015/png-clipart-linkedin-social-media-computer-icons-social-networking-service-microsoft-coin-blue-angle.png")
        ),
    )

    fun getTopCategories(userId: Int, count: Int = 5): List<Category> {
        return kTopCategories[userId]?.subList(0, min(kTopCategories[userId]?.size ?: 0, count)) ?: emptyList()
    }
}