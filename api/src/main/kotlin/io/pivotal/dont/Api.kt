package io.pivotal.dont

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Api {
    @GetMapping("/api")
    fun index()= "hello there!"
}
