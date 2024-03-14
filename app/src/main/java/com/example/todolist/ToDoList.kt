package com.example.todolist

import android.util.Log
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup

class ToDoList {
    private val tarefas : MutableList<String> = mutableListOf()
    private val taskEnabled : MutableList<CheckBox> = mutableListOf()
    fun AddTask(tarefa : String){
        tarefas.add(tarefa)
    }
}