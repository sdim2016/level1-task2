package com.slepnev.logicaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun onButtonClick() {
        var correctCount: Int = 0

        val answer1 = edtInput1.text.toString()
        val answer2 = edtInput2.text.toString()
        val answer3 = edtInput3.text.toString()
        val answer4 = edtInput4.text.toString()

        if (answer1 == "T") correctCount++
        if (answer2 == "F") correctCount++
        if (answer3 == "F") correctCount++
        if (answer4 == "F") correctCount++

        Toast.makeText(this, getString(R.string.result, correctCount), Toast.LENGTH_SHORT).show()
    }

}
