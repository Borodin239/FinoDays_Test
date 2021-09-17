package com.venus.finodays.recommendations

import org.springframework.stereotype.Service
import kotlin.math.min

@Service
class CategoriesService {
    enum class CategoryNames(name: String) {
        CHILDREN("Товары для детей"),
        BEAUTY("Красота"),
        CINEMA_AND_THEATRES("Кино и театры"),
        BOOKS("Книги и канцтовары"),
        PHARMACY("Аптеки"),
        FLOWERS_AND_GIFTS("Цветы и подарки"),
        CAFES("Кафе, рестораны, фастфуд"),
        TAXI("Такси, каршеринг"),
        PETS("Товары для животных"),
        SPORT("Спорт и активный отдых"),
        HEALTH("Здоровье"),
        AUTOS("АЗС и автоуслуги"),
        CLOTHES("Одежда, обувь, аксессуары"),
        ELECTRONICS("Электроника"),
        SUPERMARKETS("Супермаркеты и универмаги"),
        HOME("Товары для дома и ремонта"),
        OTHER("Не кешбек")
    }
    companion object {
        fun fromMMC(mmc: Long): CategoryNames =
            when(mmc.toInt()) {
                5641 -> CategoryNames.CHILDREN
                5945 -> CategoryNames.CHILDREN

                7230 -> CategoryNames.BEAUTY
                5977 -> CategoryNames.BEAUTY
                7297 -> CategoryNames.BEAUTY
                7298 -> CategoryNames.BEAUTY

                7832 -> CategoryNames.CINEMA_AND_THEATRES
                7922 -> CategoryNames.CINEMA_AND_THEATRES

                5942 -> CategoryNames.BOOKS
                5192 -> CategoryNames.BOOKS
                5943 -> CategoryNames.BOOKS
                5111 -> CategoryNames.BOOKS

                5122 -> CategoryNames.PHARMACY
                5912 -> CategoryNames.PHARMACY

                5992 -> CategoryNames.FLOWERS_AND_GIFTS
                5947 -> CategoryNames.FLOWERS_AND_GIFTS

                5811, 5812, 5813, 5814 -> CategoryNames.CAFES

                7512, 4121, 4214, 4789 -> CategoryNames.TAXI

                5995, 742 -> CategoryNames.PETS

                7941, 7997, 5996, 5941, 5655 -> CategoryNames.SPORT

                8011, 8021, 8031, 8042, 8062, 8071, 8099 -> CategoryNames.HEALTH

                5531,
                5532, 5541, 5533, 5013, 7531,
                7535, 7542, 7523, 5172, 5983,
                5542, 7534, 7538 -> CategoryNames.AUTOS

                5611, 5621, 5631, 5651, 5661,
                5691, 5699, 5948 -> CategoryNames.CLOTHES

                5722, 5732,
                5045, 5946 -> CategoryNames.ELECTRONICS

                5411, 5422, 5441, 5451,
                5462, 5499, 5921, 5311, 5331 -> CategoryNames.SUPERMARKETS

                5200, 5712, 5963, 5714, 5039,
                5074, 5198, 5211, 5231, 5713 -> CategoryNames.HOME

                else -> CategoryNames.OTHER
            }
    }

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