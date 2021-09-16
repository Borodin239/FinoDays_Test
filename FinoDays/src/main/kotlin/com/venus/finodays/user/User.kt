package com.venus.finodays.user

import javax.persistence.*

@Entity
class User(
    @Id
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "user_seq"
    )
    @SequenceGenerator(
        name = "user_seq",
        allocationSize = 1
    )
    val id: Long,

    val email: String
)
