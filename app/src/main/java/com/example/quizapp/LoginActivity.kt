package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.quizapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var intent = intent
        var userName: String? = intent.getStringExtra("username")
        var passWord: String? = intent.getStringExtra("password")
        var email: String? = intent.getStringExtra("email")

        binding.btnLogin.setOnClickListener(View.OnClickListener {
            if(binding.txtUsername.text.isNullOrBlank() || binding.txtPassword.text.isNullOrBlank() || binding.txtPassword.text.isNullOrBlank())
            {
                Toast.makeText(this,"Bạn chưa điền đủ thông tin", Toast.LENGTH_SHORT).show()
            }
            else if ( binding.txtUsername.text.toString() == userName && binding.txtPassword.text.toString() == passWord){
                Toast.makeText(this,"Đăng nhập thành công", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"Tên tài khoản hoặc mật khẩu không đúng", Toast.LENGTH_SHORT).show()
            }

        })
        binding.txtSignUp.setOnClickListener(){
            var intent : Intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
        binding.btnForgotPassword.setOnClickListener(){
            var intent :  Intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }


    }
}