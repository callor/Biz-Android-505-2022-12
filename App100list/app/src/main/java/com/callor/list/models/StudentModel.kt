package com.callor.list.models

import androidx.lifecycle.ViewModel
import com.callor.list.data.studentStringList

// "00126:매재찬:경제학:2:1:울산광역시 울주군 문수로382:010-6239-1705",
const val ST_NUM = 0
const val ST_NAME = 1
const val ST_DEPT = 2
const val ST_GRADE = 3
const val ST_ADDR = 5
const val ST_TEL = 6

class StudentModel : ViewModel() {

    /**
     * List<type> 데이터 : 요소를 추가 삭제할수 배열
     * MutableList<StudentDto> : StudentDto type 의 데이터만 저장할 수 있는
     *      배열 생성
     */
    val studentList: MutableList<StudentDto> = mutableListOf()

    init {
        getStudentList()
    }

    /**
     * 콜론(:) 구분자로 구분된 데이터 문자열을 분해하여
     * StudentDto 객체로 만들고
     * 객체를 studentList 로 변환하는 함수
     */
    private fun getStudentList() {
        studentStringList.forEach {

            // split(구분자) : 문자열을 구분자로 분해하여
            // 배열로 만들어주는 함수
            val items: List<String> = it.split(':')

            // 분해된 문자열 각 요소를 데이터 갖는 student 객체 생성
            val student = StudentDto(
                num = items[ST_NUM],
                name = items[ST_NAME],
                dept = items[ST_DEPT],
                grade = items[ST_GRADE].toInt(),
                address = items[ST_ADDR],
                tel = items[ST_TEL]
            )
            studentList.add(student)
            // studentList.add("Korea"): type 이 달라서 add 할 수 없음
        }
    }
}