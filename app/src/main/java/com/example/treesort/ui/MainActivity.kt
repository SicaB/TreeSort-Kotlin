package com.example.treesort.ui

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.treesort.R

class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputNumbers = findViewById<EditText>(R.id.inputNumbers)
        val sortButton = findViewById<Button>(R.id.sortButton)
        val outputSorted = findViewById<TextView>(R.id.outputSorted)

        viewModel.sortedNumbers.observe(this) { sortedList ->
            outputSorted.text = sortedList
        }

        sortButton.setOnClickListener {
            val userInput = inputNumbers.text.toString()
            viewModel.sortNumbers(userInput)
        }
    }
}