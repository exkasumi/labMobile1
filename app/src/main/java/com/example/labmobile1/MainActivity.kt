package com.example.labmobile1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var exercise = Numbers()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById(R.id.textView2) as TextView
        val updateButton = findViewById(R.id.UpdateButton) as Button
        val runbut = findViewById(R.id.runbut) as Button
        exercise = Numbers()
        textView.setText(exercise.inputData)

        updateButton.setOnClickListener {
            val numbersExercise = exercise as Numbers
            numbersExercise.updateNumbers()
            numbersExercise.updateData()
            val numbers = numbersExercise.numbers
            textView.setText(numbers.joinToString())
        }
        runbut.setOnClickListener {
            exercise.setRes()
            val result = exercise.result
            val str = exercise.inputData + "\n" + result
            textView.setText(str)
        }
    }


}
