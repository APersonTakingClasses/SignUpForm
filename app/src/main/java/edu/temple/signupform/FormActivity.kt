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
import android.text.*


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


        var err = "twentee owne"
        val dur = Toast.LENGTH_SHORT

        val listener = View.OnClickListener {
            val tempUsername:CharSequence = username.text
            val tempEmail:CharSequence = "pig"
            val tempPassword1:CharSequence = "dog"
            val tempPassword2:CharSequence = "dig"

            if(greeting.text == temp){
                // button to register has not been clicked once, greeting is still greeting
                // set temp save values to user input
                    //done by addTextChangedListener's
                greeting.setText(R.string.enterItems)

            }
            else {
                // temp save values are set, compare current to saved value
                if(tempUsername.isEmpty()){
                    err = getString(R.string.errorMessage1) +" "+ getString(R.string.username)
                    Toast.makeText(applicationContext,err,dur).show()
                    Log.d("message", err)
                }
                if(tempEmail.isEmpty()){
                    err = getString(R.string.errorMessage1) +" "+ getString(R.string.email)
                    Toast.makeText(applicationContext,err,dur).show()
                    Log.d("message", err)
                }
                if(tempPassword1.isEmpty()){
                    err = getString(R.string.errorMessage1) +" "+ getString(R.string.password1)
                    Toast.makeText(applicationContext,err,dur).show()
                    Log.d("message", err)
                }
                if(tempPassword2.isEmpty()){
                    err = getString(R.string.errorMessage1) +" "+ getString(R.string.password2)
                    Toast.makeText(applicationContext,err,dur).show()
                    Log.d("message", err)
                }

                if(password1.text != password2.text){
                    err = getString(R.string.errorMessage1) +" "+ getString(R.string.password1) +" "+ getString(R.string.errorMessage2) +" "+ getString(R.string.password2)
                    Toast.makeText(applicationContext,err,dur).show()
                    Log.d("message", err)
                }
            }
        }

        rButton.setOnClickListener(listener)
        username.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun afterTextChanged(p0: Editable?) {
            }

        })
        email.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(p0: Editable?) {
            }

        })
        password1.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(p0: Editable?) {
            }

        })
        password2.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun afterTextChanged(p0: Editable?) {
            }

        })
    }




}