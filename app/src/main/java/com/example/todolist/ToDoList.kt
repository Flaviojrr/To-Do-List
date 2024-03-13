package com.example.todolist

import android.util.Log
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup

class ToDoList {
    private val tarefas : MutableList<String> = mutableListOf()
    private val taskEnabled : MutableList<CheckBox> = mutableListOf()
    fun AddTask(tarefa : String){
        //Log.d("tarefas adionadas" , tarefa.toString())
        tarefas.add(tarefa)
        //Log.d("tarefas adionadas" , tarefa.toString())
    }
    fun DeleleTask(taskCollection : RadioGroup){
        for(i in 0 until taskCollection.childCount){
            taskEnabled.add(taskCollection.getChildAt(i) as CheckBox)
            //Log.d("teste" , taskEnabled.toString())
            if (taskEnabled.get(i).isChecked){
                taskEnabled.removeAt(i)
                //Log.d("teste" , taskEnabled.toString())
            }
        }
    }
}