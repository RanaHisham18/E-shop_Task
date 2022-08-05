package com.rana.e_shoptask.Ui

import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.rana.e_shoptask.R

class SignUp : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up)
      val signup_btn : Button
      signup_btn = findViewById(R.id.signUpBtn)
        signup_btn.setOnClickListener{
            val email_id = signup_emailEt.text.toString()
            val password = editTextPassword.text.toString()

            if(email_id.equals("") || password.equals("")){
                Toast.makeText(this,"Please Enter Details.",Toast.LENGTH_SHORT).show()
            }else {

                SharedPreferences!!.save_String("email_id",email_id)
                sharedPreferences!!.save_String("password",password)
                Toast.makeText(this,"Data Saved Successfully.",Toast.LENGTH_SHORT).show()
            }
        }
    }
}