package com.gm.pda

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@SpringBootApplication
class PdaApplication

fun main(args: Array<String>) {
    runApplication<PdaApplication>(*args)
}

@RequestMapping(value = "/",produces = arrayOf("text/plain;charset=UTF-8"))
fun index(): String{
    return "Hello world!"
}