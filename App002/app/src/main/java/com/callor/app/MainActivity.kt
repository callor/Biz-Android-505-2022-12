
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


//        val getResultText = registerForActivityResult()


        // findViewById() 함수야 네가 return 하는 type 이 Float... 이야 라고 선언
        // <FloatActionButton> 으로 설정한 type 과 R.id.add_word 로 선택된 대상이
        // 완전히 일치하는 type 이 아니면 컴파일 오류가 난다.
        // <> 사이에 type 을 명시하는 것을 Generic 설정 이라고 한다. (Generic type)
        val addWord = findViewById<FloatingActionButton>(R.id.add_word)
        addWord.setOnClickListener{

            /**
             * MainActivity 에서 다른 Activity 화면 열기
             * Activity 전환
             *
             * NewWordActivity::class.java
             *      Kotlin 으로 작성한 class 파일(*.kt, 소스코드)은
             *      컴파일이 된 후 java class 파일(*.class) 로 생성된다
             *
             *      Intent 라는 클래스에게
             *      java class 파일인 NewWordActivity.class 파일을 가져와서
             *      화면에 띄워라 하는 이야기
             *      class Loader 라고 한다.
             */
            val intent = Intent(this@MainActivity, NewWordActivity::class.java)
                .apply {
                    // 새로 열리는 Activity 에게 var HELLO = "반갑습니다" 처럼 변수를 만들어서
                    // 데이터를 전달하는 방법
                    putExtra("HELLO","반갑습니다")
                    putExtra("NUM1", 3000)
                    putExtra("NUM2",2000)
                }
            // getResultText.launch(intent)
            
            // 단순히 intent 로 설정된 대로 다른 Activity 를 여는 방법
            startActivity(intent)
            
        } // end fab onClick

        val phoneCallBtn = findViewById<FloatingActionButton>(R.id.phone_call)
        phoneCallBtn.setOnClickListener{
            // PhoneCall Activity 가 화면에 나타나도록
            val intent = Intent(this@MainActivity,PhoneCall::class.java)
            startActivity(intent)
        }
    }
}