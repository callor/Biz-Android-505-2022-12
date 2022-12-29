package com.callor.numgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.callor.numgame.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding:ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val rndNumber = intent.getIntExtra("rndNumber",0)
        var inputNumber = intent.getIntExtra("inputNumber",0)

        binding.txtResult.text =
            when {
                rndNumber === inputNumber -> "정답 $inputNumber 참 잘했어요"
                rndNumber > inputNumber -> "입력한 $inputNumber 가 너무 작아요"
                rndNumber < inputNumber -> "입력한 $inputNumber 가 너무 커요"
                else->"알 수 없어요"
            }
    }
}