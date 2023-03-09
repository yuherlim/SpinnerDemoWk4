package com.example.spinnerdemowk4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val spinnerChoice : Spinner = findViewById(R.id.spinner)
        var list_of_items = arrayOf("Teh", "Coffee", "Milo")

        //Create an ArrayAdapter using as simple spinner layout and languages array
        val aa = ArrayAdapter(this, android.R.layout.simple_spinner_item, list_of_items)
        // Set layout to use when the list of choices appear
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        //Set adapter to spinner
        spinnerChoice!!.setAdapter(aa)

    }

    fun onItemSelected(arg0: AdapterView<*>, arg1: View, position: Int, id: Long) {
        val textBox1: TextView = findViewById(R.id.txtBox1)
        var text = when(position) {
            0 -> "Teh"
            1 -> "Coffee"
            else -> "Milo"
        }
        textBox1.text = text
    }

    fun onNothingSelected(arg0: AdapterView<*>) {

    }
}