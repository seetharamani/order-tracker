package com.cc.ordertracker.repository

import kotlinx.coroutines.flow.Flow
import org.springframework.data.r2dbc.repository.Query
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.data.repository.query.Param
import java.util.UUID

interface OrderRepository: CoroutineCrudRepository<Order, UUID> {
    // language=SQL
    @Query("""
        SELECT * FROM (
            SELECT * FROM ORDER
            ORDER BY "TIME" DESC
            LIMIT 10
        ) ORDER BY "TIME"
    """)
    fun findLatest(): Flow<Order>

    // language=SQL
    @Query("""
        SELECT * FROM (
            SELECT * FROM ORDER
            WHERE TIME > (SELECT TIME FROM ORDER WHERE ID = :id)
            ORDER BY "TIME" DESC 
        ) ORDER BY "TIME"
    """)
    fun findLatest(@Param("id") id: UUID): Flow<Order>
}