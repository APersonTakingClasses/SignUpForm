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

        val regButton = this.findViewById<Button>(R.id.button)
        val logButton = findViewById<Button>(R.id.button2)
        val greeting = findViewById<TextView>(R.id.greeting)
        val username = findViewById<EditText>(R.id.username)
        val email = findViewById<EditText>(R.id.email)
        val password1 = findViewById<EditText>(R.id.password1)
        val password2 = findViewById<EditText>(R.id.password2)

        var temp = getText(R.string.greeting)
        val tempUsername:CharSequence = "pig"
        val tempEmail:CharSequence = "pig"
        val tempPassword1:CharSequence = "dog"
        val tempPassword2:CharSequence = "dog"

        var err = "twentee owne"
        val dur = Toast.LENGTH_SHORT

        val listener1 = View.OnClickListener {

            if(greeting.text == temp){
                // button to register has not been clicked once, greeting is still greeting
                // set temp save values to user input
                    //done by addTextChangedListener's
                greeting.setText(R.string.enterItems)

                //tempUsername = username.text
                //tempEmail = email.text
                //tempPassword1 = password1.text
                //tempPassword2 = password2.text

            }

                // temp save values are set, compare current to saved value
                if(username.text.isEmpty()){
                    err = getString(R.string.errorMessage1) +" "+ getString(R.string.username)
                    Toast.makeText(applicationContext,err,dur).show()
                    Log.d("message", err)
                }
                if(email.text.isEmpty()){
                    err = getString(R.string.errorMessage1) +" "+ getString(R.string.email)
                    Toast.makeText(applicationContext,err,dur).show()
                    Log.d("message", err)
                }
                if(password1.text.isEmpty()){
                    err = getString(R.string.errorMessage1) +" "+ getString(R.string.password1)
                    Toast.makeText(applicationContext,err,dur).show()
                    Log.d("message", err)
                }
                if(password2.text.isEmpty()){
                    err = getString(R.string.errorMessage1) +" "+ getString(R.string.password2)
                    Toast.makeText(applicationContext,err,dur).show()
                    Log.d("message", err)
                }

        }
        val listener2 = View.OnClickListener {
            if( username.text == tempUsername ){
                err = getString(R.string.errorMessage1) +" "+ getString(R.string.username)
                Toast.makeText(applicationContext,err,dur).show()
                Log.d("message", err)
            }
            else if(email.text == tempEmail){
                err = getString(R.string.errorMessage1) +" "+ getString(R.string.email)
                Toast.makeText(applicationContext,err,dur).show()
                Log.d("message", err)
            }
            else if(password1.text == tempPassword1){
                err = getString(R.string.errorMessage1) +" "+ getString(R.string.password1)
                Toast.makeText(applicationContext,err,dur).show()
                Log.d("message", err)
            }
            else if(tempPassword1 != tempPassword2){
                err = getString(R.string.errorMessage1) +" "+ getString(R.string.password1) +" "+ getString(R.string.errorMessage2) +" "+ getString(R.string.password2)
                Toast.makeText(applicationContext,err,dur).show()
                Log.d("message", err)
            }

            else{
                err = getString(R.string.confirmation)
                Toast.makeText(applicationContext,err,dur).show()
                Log.d("message", err)
            }

        }

        regButton.setOnClickListener(listener1)
        logButton.setOnClickListener(listener2)
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

