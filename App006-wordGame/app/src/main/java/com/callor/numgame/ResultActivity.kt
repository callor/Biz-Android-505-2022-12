package com.callor.numgame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
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
                rndNumber === inputNumber -> getString(R.string.good_job, inputNumber)
                rndNumber > inputNumber -> getString(R.string.number_less_than,inputNumber)
                rndNumber < inputNumber -> getString(R.string.number_greater_than,inputNumber)
                else->getString(R.string.number_not)
            }
    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        Log.d("Result","Result")
    }
}