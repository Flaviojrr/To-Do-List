package com.example.todolist

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var taskName : String
        var newTaskCheckBox : CheckBox
        val taskEditText = findViewById<EditText>(R.id.editTextNovaTarefa)
        val radioGroupTasks  = findViewById<RadioGroup>(R.id.radioGroupTarefas)
        val newTaskButton = findViewById<Button>(R.id.novaTarefa)
        val deleteTask = findViewById<Button>(R.id.deleteTask)
        newTaskButton.setOnClickListener{
            if(taskEditText.text.toString().length==0){
                Log.d("Add new task","null")
            }else{
                taskName = taskEditText.text.toString()
                ToDoList.OnlyInstance.AddTask(taskName)
                newTaskCheckBox = CheckBox(this)
                newTaskCheckBox.text = taskName
                radioGroupTasks.addView(newTaskCheckBox)
                taskEditText.text.delete(0,taskEditText.text.count())
            }
        }
        deleteTask.setOnClickListener{
            ToDoList.OnlyInstance.DeleteTask(radioGroupTasks)
        }
    }
}