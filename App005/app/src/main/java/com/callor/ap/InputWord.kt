package com.callor.ap

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class InputWord : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_word)
        val inputWord = findViewById<TextInputEditText>(R.id.txt_input)
        inputWord.setOnEditorActionListener { view, keyCode, event ->
            val value = inputWord.text.toString()
            if (value.isEmpty()) {
                Snackbar.make(view, "단어를 입력하세요", Snackbar.LENGTH_LONG).show()
            }

            /**
             * input box 의 키보드가 보이는 상태에서
             * Snack bar 를 보이면 키보드에 가려져서 Snack bar 가 보이지 않기때문에
             * 마자막의 값을 false 르 해 주면 키보드가 자동으로 사란진다
             */
            false
        }
    }
}