package br.com.fabianafarias.todolist.datasource

import br.com.fabianafarias.todolist.model.Task

object TaskDataSource {
    private val list = arrayListOf<Task>()

    fun getList() = list

    fun insertTask(task: Task) {
        list.add(task.copy(id = list.size + 1))
    }
}