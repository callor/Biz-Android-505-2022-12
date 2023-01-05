package com.callor.list

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.callor.list.databinding.ActivityMainBinding
import com.callor.list.models.StudentModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val stViewModel: StudentModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // viewModel 에서 생성된 데이터 확인하기
        val studentList = stViewModel.studentList
        studentList.forEach {
            Log.d("Main", "${it.name} ${it.address} ${it.tel}")
        }
        
    }
}