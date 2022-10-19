package com.example.lavinsky

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        val textView: TextView = findViewById(R.id.name)
        val arguments:Bundle? = intent.extras
        if (arguments != null)
        {
            val name:String? = arguments.get("name").toString()
            val age: Int? = arguments.getInt("age")
            val email: String? = arguments.get("email").toString()
            textView.text = " Ваши данные : \n Имя: $name \n Возраст: $age \n Электронная почта: $email "
        }


    }

    fun buttonTyClick(view: View) {
        val nameText: EditText = findViewById(R.id.textname1)
        val ageText: EditText = findViewById(R.id.textage1)
        val emailText: EditText = findViewById(R.id.textemail1)
        val name = nameText.text.toString()
        val age = ageText.text.toString().toInt()
        val email = emailText.text.toString()
        val intent: Intent = Intent(this@info , MainActivity::class.java)
        intent.putExtra("name", name)
        intent.putExtra("age", age)
        intent.putExtra("email", email)
        startActivity(intent)


    }
}


