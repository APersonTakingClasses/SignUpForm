package edu.temple.signupform

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.constraintlayout.widget.ConstraintSet
import androidx.constraintlayout.widget.ConstraintSet.*
import android.widget.ArrayAdapter as ArrayAdapter

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rButton = this.findViewById<Button>(R.id.button)
        val greeting = findViewById<TextView>(R.id.greeting)
        val username = findViewById<EditText>(R.id.username)
        val email = findViewById<EditText>(R.id.email)
        val password1 = findViewById<EditText>(R.id.password1)
        val password2 = findViewById<EditText>(R.id.password2)

        var temp = getText(R.string.greeting)
        var tempUsername:CharSequence = "123"
        var tempEmail:CharSequence
        var tempPassword1:CharSequence
        var tempPassword2:CharSequence

        val listener = object: View.OnClickListener{
            override fun onClick(p0: View?) {
                if(greeting.text != temp){
                    // button to register has not been clicked once
                    // set temp save values to user input
                    tempUsername = username.text
                    tempEmail = email.text
                    tempPassword1 = password1.text
                    tempPassword2 = password2.text
                    temp = getText(R.string.enterItems)
                }
                else {
                    // temp save values are set, compare current to saved value
                    if( tempUsername != username.text){
                        val toast = Toast.makeText(applicationContext, getText(R.string.errorMessage1), Toast.LENGTH_SHORT)
                        toast.show()
                    }
                }


            }
        }

        rButton.setOnClickListener(listener)
    }




}