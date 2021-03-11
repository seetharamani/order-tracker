package com.cc.ordertracker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories

@SpringBootApplication
@EnableR2dbcRepositories
open class OrderTrackerApplication

fun main(args: Array<String>) {
    runApplication<OrderTrackerApplication>(*args)
}


