package com.example.todolist

import android.util.Log
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup

class ToDoList {
    object OnlyInstance{
        private val tarefas : MutableList<String> = mutableListOf()
        private val taskEnabled : MutableList<CheckBox> = mutableListOf()
        fun AddTask(tarefa : String){
            tarefas.add(tarefa)
        }
        fun DeleteTask(radioGroupTasks : RadioGroup){
            for (i in 0..radioGroupTasks.childCount){
                var checkboxteste = radioGroupTasks.getChildAt(i)
                if (checkboxteste is CheckBox && checkboxteste.isChecked){
                    radioGroupTasks.removeView(checkboxteste)
                }
            }
        }
    }

}