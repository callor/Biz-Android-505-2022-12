package com.callor.list.models

/**
 * data class
 * Kotlin 에서 프로그래밍을 할때
 * data 들을 하나의 묶음으로 처리하는 용도의 클래스
 * 이 클래스를 객체로 생성하여 학생 개별 데이터를
 * 저장한다
 * 저장한 데이터는 DB 에 보내거나 UI 보내는 용도로 사용
 *
 * Java 와 같은 언어에는 data class 라는 개념이 없다
 * Java 와 같은 언어에서 일반 class 를 data class 처럼
 * 사용하기 위하여 이름 끝에 Dto 라는 접미사를 붙여서 구분하였다
 * DTO : Data Transfer Object : 데이터를 함수간에 이동할때
 *      사용하는 객체 라는 의미
 * VO : Value Object : DTO 와 거의 유사한 성질인데 사용용도가
 *      약간 다름
 */
// "00126:매재찬:경제학:2:1:울산광역시 울주군 문수로382:010-6239-1705",
data class StudentDto(
    val num: String? = null,
    val name: String? = null,
    val dept: String? = null,
    val grade: Int? = 0,
    val address: String? = null,
    val tel: String? = null
)
