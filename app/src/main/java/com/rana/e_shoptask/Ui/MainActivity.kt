package com.rana.e_shoptask.Ui

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.rana.e_shoptask.R


class MainActivity : AppCompatActivity() {


    var sharedPreference: SharedPrefrences? = null
    lateinit var edt_email: EditText
    lateinit var edt_password: EditText
    lateinit var btn_login: Button
    lateinit var btn_sign_up: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sharedPreference = SharedPreferences(this)
        edt_email = findViewById(R.id.emailEt)
        edt_password = findViewById(R.id.passwordET)
        btn_login = findViewById(R.id.loginBT)
        btn_sign_up = findViewById(R.id.signUpBtn)

        val str_login_status = sharedPreference!!.getPreferenceString("login_status")
        if (str_login_status!=null){
            val intent = Intent(this,ShoppingList::class.java)
            startActivity(intent)
            finish()
        }


        /////////////////////////

        btn_login.setOnClickListener {
            val str_email_id = edt_email.text.toString()
            val str_password = edt_password.text.toString()

            if(str_email_id.equals("") || str_password.equals("")){
                Toast.makeText(this,"Please Enter Details.",Toast.LENGTH_SHORT).show()
            }else {
                val email_id = sharedPreference!!.getPreferenceString("email_id")
                val password = sharedPreference!!.getPreferenceString("password")

                if(email_id.equals(str_email_id) && password.equals(str_password)){
                    sharedPreference!!.save_String("login_status","1")

                    val intent = Intent(this, ShoppingList::class.java)
                    startActivity(intent)
                    finish()
                }else {
                    Toast.makeText(this,"User Not Available.",Toast.LENGTH_SHORT).show()
                }
            }
        }

        btn_sign_up.setOnClickListener {
            val intent = Intent(this, SignUp::class.java)
            startActivity(intent)
            finish()
        }

    }

}

