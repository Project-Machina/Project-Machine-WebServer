package com.web.server

import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.http.content.*
import io.ktor.server.netty.*
import io.ktor.server.plugins.*
import io.ktor.server.routing.*

object Application {

    @JvmStatic
    fun main(args: Array<String>) {
        embeddedServer(Netty, 8085) {
            install(ContentNegotiation) {
                json()
            }
            routing {
                static("fxml") {
                    files("fxml")
                }
                static("images") {
                    files("images")
                }

                post("assets") {

                }
            }
        }.start(wait = true)
    }

}