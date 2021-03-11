package com.cc.ordertracker.repository

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.time.Instant
import java.util.*

@Table("ORDER")
data class Order(
    @Id var id: UUID,
    val name: String,
    val time: Instant,
    val phoneNumber: String,
    val description: String,
    val carMake: String,
    val carModel: String
)