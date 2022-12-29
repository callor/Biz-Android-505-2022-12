package com.callor.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        val txtName = findViewById<TextView>(R.id.txt_name)
        val txtAge = findViewById<TextView>(R.id.txt_age)

        /**
         * 나를 open 한 Activity 에서 username 이라는 변수에
         * 문자열(String) 데이터(Extra)를 보냈을 것이다
         * 그 데이터를 추출(get)하고, 그중에서 문자열 부분만 추출(toString())하여
         * strName 변수에 저장해 달라
         * fetch()
         * .then( res => res.json() )
         * .then( result => console.log(result) )
         */
        val strName = intent.getStringExtra("username").toString()
        txtName.text = strName

        // 숫자 Extra 일 경우는 값이 없을때 문제가 될수 있기 때문에
        // defaultValue 를 지정해 준다
        val intAge = intent.getIntExtra("age",0)
        txtAge.text = intAge.toString()

    }
}