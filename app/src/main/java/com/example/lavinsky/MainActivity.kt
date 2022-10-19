package com.example.lavinsky

import android.content.Intent
import android.media.Image.Plane
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText: EditText = findViewById(R.id.textname)
        val argumentsSec:Bundle? = intent.extras
        val textname: TextView = findViewById(R.id.textname)
        val textViewn: TextView = findViewById(R.id.textname)
        val textViewa: TextView = findViewById(R.id.textage)
        val textViewg: TextView = findViewById(R.id.textemail)

        val arguments:Bundle? = intent.extras
        if (arguments != null)
        {
            val name:String? = arguments.get("name").toString()
            val age: Int? = arguments.getInt("age")
            val email: String? = arguments.get("email").toString()
            textname.text="Name: $name"
            textViewn.text="$name"
            textViewa.text="$age"
            textViewg.text="$email"

        }

    }
    fun buttonOnClick(view: View){



            val nameText: EditText = findViewById(R.id.textname)
            val ageText: EditText = findViewById(R.id.textage)
            val emailText: EditText = findViewById(R.id.textemail)
            val name = nameText.text.toString()
            val age = ageText.text.toString().toInt()
            val email = emailText.text.toString()
            val intent:Intent = Intent(this@MainActivity , info::class.java)
            intent.putExtra("name", name)
            intent.putExtra("age", age)
            intent.putExtra("email", email)
            startActivity(intent)
        }

    }
