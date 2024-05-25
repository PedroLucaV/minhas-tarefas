package br.com.pedroLucas.plugins

import br.com.pedroLucas.models.Task
import br.com.pedroLucas.repositories.TasksRespository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    val repository = TasksRespository();
    routing {
        get("/"){
            call.respondText("Hello World!")
        }
        get("/tasks") {
            call.respond(repository.tasks)
        }
        post("/tasks") {
            val task = call.receive<Task>()
            repository.save(task);
            call.respondText("Tarefa adicionada!", status = HttpStatusCode.Created);
        }
    }
}
