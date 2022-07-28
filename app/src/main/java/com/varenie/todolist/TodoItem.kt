package com.varenie.todolist

data class TodoItem(
    val id: String,
    val text: String,
    val priority: Priority,
    val deadline: String,
    val isFinish: Boolean,
    val creatureDate: String,
    val updateDate: String
)

enum class Priority {
    LOW, DEFAULT, HIGH
}
