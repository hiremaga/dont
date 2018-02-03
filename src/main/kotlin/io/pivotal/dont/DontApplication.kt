package io.pivotal.dont

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DontApplication

fun main(args: Array<String>) {
    runApplication<DontApplication>(*args)
}
