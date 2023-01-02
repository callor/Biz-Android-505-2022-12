package com.callor.ap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnInsert = findViewById<Button>(R.id.btn_insert)

        // button 이 클릭되었을때 새로운 창 열기
        btnInsert.setOnClickListener {
            // MainActivity 에서 InputWord Activity 를 열기 위한 준비
            val inputItent = Intent(this@MainActivity, InputWord::class.java)
            
            // Intent 시작하기
            startActivity(inputItent)
        }
    }
}

