package com.callor.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class NewWordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_word)

        // MainActivity 에 putExtra 로 전달된 변수들에게 값 추출하기
        val hello = intent.getStringExtra("HELLO")
        val num1 = intent.getIntExtra("NUM1",0)
        val num2 = intent.getIntExtra("NUM2",0)

        Log.d("NEW HELLO",hello.toString())
        Log.d("NEW NUM1",num1.toString())
        Log.d("NEW NUM2",num2.toString())

    }
}