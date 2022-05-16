package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.quizapp.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSignUp.setOnClickListener(){
            if(binding.txtUsename.text.isNullOrBlank() || binding.txtPassword.text.isNullOrBlank() || binding.txtEmail.text.isNullOrBlank())
            {
                Toast.makeText(this,"Bạn chưa điền đủ thông tin", Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this,"Đăng ký thành công", Toast.LENGTH_LONG).show()
            }
        }
        fun putDataForm(){
            intent.putExtra("username", binding.txtUsename.text.toString())
            intent.putExtra("password", binding.txtPassword.text.toString())
            intent.putExtra("email", binding.txtEmail.text.toString())
        }
        binding.txtLogin.setOnClickListener {
            val intent: Intent = Intent(applicationContext, LoginActivity::class.java)
            putDataForm()
            startActivity(intent)
        }
        binding.btnBack.setOnClickListener(){
            var intent : Intent = Intent(this, LoginActivity::class.java)
            putDataForm()
            startActivity(intent)
        }
    }
}