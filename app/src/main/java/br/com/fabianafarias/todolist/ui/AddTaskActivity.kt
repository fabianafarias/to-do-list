package br.com.fabianafarias.todolist.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.fabianafarias.todolist.databinding.ActivityAddTaskBinding

class AddTaskActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityAddTaskBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}