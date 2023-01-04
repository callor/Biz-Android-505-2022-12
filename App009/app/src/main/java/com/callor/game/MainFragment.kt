package com.callor.game

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.callor.game.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    /**
     * class 내부에서 선언된 변수(배열, 객체 등등) 에 private 접근한정자가 부착되면
     * 이 변수는 MainFragment 클래스(객체)내부의 코드들에서만 접근이 가능하다
     *      여기 변수에 접근(값의 저장, 값의 변경, 값을 읽기 등등) 할수 있다
     * 이러한 변수를 감추는 것을 객체지향 프로그래밍(oop)에서는 정보의 은닉이라고 한다
     * 중요한 데이터를 어디선가 임의로 변경하는 것을 방지하는 목적이다
     * 멀티테스킹(멀티스레드) 환경에서 다수의 테스트가 한 변수에 접근하여 발생하는
     *      문제를 방지하기도 한다.
     *
     * 은닉처리가 된 정보(변수..)를 외에서 읽거나 쓸수있도록
     *      제한적으로 개방을 할수 있는데
     *      객체지향 실무에서는 이것을 getter, setter 라고 한다
     *
     * 즉, 외에서 은닉처리된 변수에서 값을 읽고자 할때는 get() method 를 통해서 읽고
     * 값을 저장(메시지 전송)하고자 할때는 set() method 를 통해서 실행한다
     *
     * 캡슐화
     * 외부에서 get() method 통해서 값을 읽으면
     *      객체 내부에서 어떤 연산이 어떻게 이루어지는지 몰라도
     *      get()를 통해서 읽은 값은 정확한 데이터일 것이라 라는 보장
     *
     */
//    private  var _binding : FragmentMainBinding? = null
    private lateinit var binding : FragmentMainBinding
    // 접근제한자 가 없는(val, var 로 선언된) 변수는 public 이다
    // Java 와 같은 다른 언어에서는 "public" 키워드를 부착해 주어야 한다.
    // MainFragment 외부에서 누구나 binding getter method 통하여 _binding 데이터를
    // 읽을 수 있다

    /**
     * 객체지향에서 변수를 은닉하고
     * 은닉된 변수를 외부에서 getter 하여 사용할수 있도록
     * get() method 는 접근제한자 없이 개방하는 것이 원칙이다
     *
     * Fragment 에서는 독특하게 get() 를 private 접근제한하여
     * 현재 클래스(객체)내에서 사용하고, 사용이 끝나면 null 로 처리하여
     * clear 하는 정책을 권장한다
     *
     * Fragment 는 화면을 구현하기 위하여 많은 view 들을 가지고 있는 상태이다
     * 잘못 사용하면 메모리 누수(leak) 가 발생하여 앱이 강제 종료되거나
     * 스마트 기기가 작동이 불편해지는 상황이 발생하기 때문에
     * 그러한 문제를 사전에 예방하기 위한 조치이다.
     */
//    private val binding get() = _binding!!

    /**
     * onCreateView 함수가 실행되는 동안에는
     * 화면에 그려지는 view 들이 미완성되었을 수 있다
     * 화면에 그려지는 view 들에게 행해지는 연산은 
     * onViewCreated 함수에서 코드를 작성한다
     */
    override fun onCreateView (
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
        // return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // event 를 설정하거나
        // 어떤 view 통해서 문자열을 읽거나
        // view 에 문자열을 보이거나 하는 일들은
        // onCreateView 에서 수행하지 말고, onViewCreated 에서 하도록 한다
//        binding.
    }

    /**
     * Fragment 사용이 종료되었을때 할일 지정
     * Fragment 사용이 끝났을때 view.xml 과 연결된 _binding 변수를
     * 제거해 주어야 한다.
     * 그래야만 만약의 경우 발생하는 메모리 누스를 방지할 수 있다.
     */
//    override fun onDestroy() {
//        super.onDestroy()
//        _binding = null
//    }


}