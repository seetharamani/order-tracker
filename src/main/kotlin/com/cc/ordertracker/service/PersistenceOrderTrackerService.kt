package com.cc.ordertracker.service

import com.cc.ordertracker.repository.OrderRepository
import kotlinx.coroutines.flow.Flow
import java.util.*

class PersistenceOrderTrackerService(val orderRepository: OrderRepository) : OrderTrackerService {
    override fun latest(): Flow<OrderVM> {
        TODO("Not yet implemented")
    }

    override fun after(orderId: UUID): Flow<OrderVM> {
        TODO("Not yet implemented")
    }

    override fun stream(): Flow<OrderVM> {
        TODO("Not yet implemented")
    }

    override suspend fun post(messages: Flow<OrderVM>) {
        TODO("Not yet implemented")
    }
}