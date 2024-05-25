package br.com.pedroLucas.repositories

import br.com.pedroLucas.models.Task

class TasksRespository {

    val tasks get() =  _tasks.toList()

    fun save(task: Task){
        _tasks.add(task);
    }
    companion object {
        private val _tasks = mutableListOf<Task>();
    }
}