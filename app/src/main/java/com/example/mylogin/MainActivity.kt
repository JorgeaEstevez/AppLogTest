package com.example.mylogin

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var user:EditText
    lateinit var btnlog:Button
    lateinit var msguser:TextView


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        user=findViewById(R.id.edtxt_user)
        btnlog=findViewById(R.id.btn_Lin)

        btnlog.setOnClickListener {
            val name = user.text.toString()
            Toast.makeText(this , name, Toast.LENGTH_LONG).show()

            val intent = Intent(this,MainActivity::class.java)
            intent.putExtra("User",name)
            startActivity(intent)

        }

        msguser = findViewById(R.id.edtxt_user)

        msguser.text = intent.getStringExtra("User")

    }
}