
package com.callor.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // addWord 변수에게 너의 type 은 Float.... 이다 라는 것을 알려주는 방법
        // val addWord:FloatingActionButton = findViewById(R.id.add_word)


        val getResultText = registerForActivityResult()


        // findViewById() 함수야 네가 return 하는 type 이 Float... 이야 라고 선언
        // <FloatActionButton> 으로 설정한 type 과 R.id.add_word 로 선택된 대상이
        // 완전히 일치하는 type 이 아니면 컴파일 오류가 난다.
        // <> 사이에 type 을 명시하는 것을 Generic 설정 이라고 한다. (Generic type)
        val addWord = findViewById<FloatingActionButton>(R.id.add_word)
        addWord.setOnClickListener{
            val intent = Intent(this@MainActivity, NewWordActivity::class.java)
            // getResultText.launch(intent)
            // intent.
        }





    }
}