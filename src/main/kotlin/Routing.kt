package com.example

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
var i = 0
fun Application.configureRouting() {
    routing {
        get("/") {
            if (i != 5) {
                call.respondText("Hello World!")
                i++
            }else{
                i = 0
                call.respond(HttpStatusCode.InternalServerError,"OOOOPS")
            }
        }
    }
}
