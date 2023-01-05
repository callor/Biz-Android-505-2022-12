package com.callor.game.models

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.callor.game.data.allWordsList

/**
 * 클래스를 만들때 이름 부여 규칙
 * 첫글자는 영문대문자
 * 두 번째부터는 영문대 소문자, 숫자, _ 등 사용가능
 * 가급적 2단어 이상을 조합하여 명명
 * Under Bar(_) 를 사용하기 보다는
 * CamelCase 형식으로 명명을 한다
 *
 * ---ViewModel 클래스는 lifecycle 의 ViewModel 클래스를
 * 상속받아서 작성한다
 * */
class WordViewModel : ViewModel() {
    var currentWord = MutableLiveData("")
    var unscrambleWord = MutableLiveData("")
    var inputWord = MutableLiveData("")

    /**
     * 게임을 하는 과정에서 맞춘 점수
     * 시행한 게임 수 등을 저장할 변수
     *
     * 정답을 맞추면 gameScore 를 1 증가시키고
     * 게임 카운트도 1 증가시키고
     *
     * gameScore 가 10이 되면 "축하합니다" 라는 메시지를 출력
     */
    var gameScore = MutableLiveData(0)
    var gameCount = MutableLiveData(0)

    /**
     * Kotlin 클래스를 사용하여 객체가 생성되는 순간
     * init {} 블럭 의 코드가 자동으로 실행된다
     * 여기에는 내부에서 사용할 변수를 초기화 하거나, 미리 실행해야할 코드를 추가 해 놓는다
     */
    init {
        nextWord()
    }
    fun nextWord () {
        // 영문단어를 char(문자) 배열로 변경하고
        val engString  =  allWordsList.random()
        val rndString = engString.toCharArray()
        // 무작위로 shuffle() 하기, rndString 데이터 자체가 변경
        rndString.shuffle()
        // char 배열을 문자열(String) 으로 변환시키기
        currentWord.value = rndString.joinToString (separator = " ")
        unscrambleWord.value = engString

    }

}