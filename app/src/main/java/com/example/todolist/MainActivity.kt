package com.example.todolist

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tarefaNome : String
        var novaTarefaCheckBox : CheckBox
        val tarefa = findViewById<EditText>(R.id.editTextNovaTarefa)
        val radioGroupTarefas  = findViewById<RadioGroup>(R.id.radioGroupTarefas)
        val novaTarefaBotao = findViewById<Button>(R.id.novaTarefa)
        val deleteTask = findViewById<Button>(R.id.deleteTask)
        novaTarefaBotao.setOnClickListener{
            if(tarefa.text.toString().length==0){
                Log.d("Add new task","null")
            }else{
                tarefaNome = tarefa.text.toString()
                ToDoList().AddTask(tarefaNome)
                novaTarefaCheckBox = CheckBox(this)
                novaTarefaCheckBox.text = tarefaNome
                radioGroupTarefas.addView(novaTarefaCheckBox)
                tarefa.text.delete(0,tarefa.text.count())
            }
        }
        deleteTask.setOnClickListener{
            for (i in 0..radioGroupTarefas.childCount){
                var checkboxteste = radioGroupTarefas.getChildAt(i)
                if (checkboxteste is CheckBox && checkboxteste.isChecked){
                    radioGroupTarefas.removeView(checkboxteste)
                }
            }
        }
    }
}