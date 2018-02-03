package io.pivotal.dont

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Api {
    @GetMapping("/")
    fun index()= "hello there!"
}
