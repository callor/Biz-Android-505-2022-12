package com.callor.hello

/**
 *
 * 변수를 선언하는 키워드
 * var : 언제든지 값을 변경할수 있는 일반적인 변수
 *      값을 재 할당 할수 있다
 *      JS 에서 let 키워드와 같다
 * val : 한번 할당된 변수는 값을 재 할당할수 없다
 *      JS 에서 const 키워드와 같다
 *
 * Kotlin 에서는 변수를 선언할때 초기값을 지정해야 한다
 *
 * Kotlin 언어는 태생이 자바(Java)다
 * Java 불편한점을 개선하기 위하여 탄생언어이다
 * 개선을 하기는 했지만 Java 의 성질을 상당부분 가지고 있다
 *
 */
var num1:Int = 0;
var num2:Int = 0;
var sum:Int = num1 + num2;

/**
 * numAdd() 함수는 어딘가에서 호출을 하면
 * 변수 num1 과 num2 의 값을 덧셈하여 return 하도록 되어 있다
 * 이때는 return 하는 값의 type 을 반드시 함수명에
 * 명시해주어야 한다.
 */
fun numAdd() : Int {
    return num1 + num2;
}

/**
 * 어딘가에서 printSum() 함수를 호출하면
 * num1 과 num2 의 값을 덧셈하여
 * 결과를 console 출력하고 함수를 종료한다
 * return 이 없다
 * 이때는 return type 을 사용하지 않아도 된다.
 */
fun printSum() {
    print(num1 + num2)
}

/**
 * 진입점, 시작점 함수
 */
fun main() {
    num1 = 100;
    num2 = 200;

    sum = num1 + num2;
    print(sum)

    /**
     * numAdd() 함수가 return 한 결과를 받아서
     * sum 변수에 할당하기
     */
    sum = numAdd();
    print(sum)
}
