package com.cc.ordertracker.service

import kotlinx.coroutines.flow.Flow
import java.util.*

interface OrderTrackerService {

    fun latest(): Flow<OrderVM>

    fun after(orderId: UUID): Flow<OrderVM>

    fun stream(): Flow<OrderVM>

    suspend fun post(messages: Flow<OrderVM>)
}