package com.callor.hello

fun main() {

    var num1 = 100;
    var num2 = 200;
    val sum = num1 + num2

    println(sum)

    /**
     * 문자열 template
     * 문자열 리터럴 연산식
     * 문자열에 변수, 연산식을 포함하여
     * 한번에 표시하기
     */
    println("$num1 + $num2 = ${num1 + num2}")
    println("" + num1 + " + " + num2 + "=" +(num1 + num2))

    // 두 문자열 변수에 담긴 데이터를 연결하여 출력하기
    // 문자열 변수의 type 은 String
    var nation:String = "대한민국";
    var engNation:String = "Republic of Korea"
    println(nation + engNation)

    /**
     * null safe
     * 변수에 null 값을 허용하는 코드
     * Kotlin 은 null safe 를 지향하는 언어이다
     * 코드가 실행되는 과정에서 null point Exception 을
     * 발생하지 않도록 설계되고 코딩하는 언어이다
     * 초기에는 아예 모든 변수에 null 값을 저장할수 없었다
     * 제한적으로 null 을 저장할수 있도록 변경되었다.
     */
    var nullString : String? = null
    nullString = "우리나라만세"
    print(nullString)
}

/**
 * 변수 type 과 함수의 return type
 * 개발자 입장에서 변수의 type 과 함수의 return type은
 * 한편으로 반드시 지켜야되는 규칙이기 때문에
 * 불편함으로 다가올수 있다.
 *
 * 초창기에는 메모리 관리 문제로 type 을 사용했는데
 * 지금 현대에는 코드가 시행되는 과정에서
 * type 때문에 발생하는 어려 오차, 오를 방지하는 역할을 한다,
 *
 * 변수 type 이 없는 언어로 코딩을 하는 과정에서 상당히
 * 자주 데이터 연산 오류가 발생을 하는데
 * type 이 있는 언어는 실행되기전에 컴파일 단계에서
 * 오류를 보여주고 코드를 정정하도록 한다.
 */
