package io.pivotal.dont

import org.junit.Test
import org.springframework.boot.test.context.SpringBootTest
import org.hamcrest.Matchers.*

import io.restassured.module.mockmvc.RestAssuredMockMvc.*
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class ApiTest {
    @Autowired
    lateinit var api: Api

    @Test
    fun `it responds with a simple example`() {
        given()
            .standaloneSetup(api)
        .`when`()
            .get("/api")
        .then()
                .body(equalTo("hello there!"))
    }
}