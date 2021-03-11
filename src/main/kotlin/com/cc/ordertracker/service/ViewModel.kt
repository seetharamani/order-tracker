package com.cc.ordertracker.service

import java.time.Instant
import java.util.*

data class OrderVM(val id: UUID, val name: String, val description: String, val time: Instant, val carMake: String, val carModel: String)
