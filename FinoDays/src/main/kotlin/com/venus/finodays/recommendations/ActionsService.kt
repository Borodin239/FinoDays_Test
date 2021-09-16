package com.venus.finodays.recommendations

import org.springframework.stereotype.Service

@Service
class ActionsService {

    private val kActions = mapOf<Int, List<Action>>(
        1 to listOf(Action("Action 1.1")),
        2 to listOf(Action("Action 2.1"), Action("Action 2.2"))
    )

    fun getActions(userId: Int): List<Action> {
        return kActions[userId] ?: emptyList()
    }

}
