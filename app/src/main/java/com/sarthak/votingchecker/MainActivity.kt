package com.sarthak.votingchecker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    private lateinit var btn : Button
    private lateinit var radioGroup: RadioGroup
    private lateinit var male : RadioButton
    private lateinit var female : RadioButton
    private lateinit var hindi : CheckBox
    private lateinit var english : CheckBox
    private lateinit var punjabi : CheckBox
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.button)
        radioGroup = findViewById(R.id.radioGroup)
        male = findViewById(R.id.maleRB)
        female = findViewById(R.id.femaleRB)
        hindi = findViewById(R.id.Hindi)
        english = findViewById(R.id.English)
        punjabi = findViewById(R.id.Punjabi)
        textView = findViewById(R.id.textv)


        btn.setOnClickListener(View.OnClickListener {
            print()
        })

    }
    private fun print(){
        var result = ""
        if (radioGroup.checkedRadioButtonId !=-1){
            result += "Selected Gender : "
            if(male.isChecked)
                result += "Male\n"
            else if (female.isChecked)
                result += "Female\n"
        }
        result += "Languages Known : "

        if (hindi.isChecked)
            result += "Hindi "

        if (english.isChecked)
            result += "English "

        if (punjabi.isChecked)
            result += "Punjabi "

        textView.text = result
    }
}
