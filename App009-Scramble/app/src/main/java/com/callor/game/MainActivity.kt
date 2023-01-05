package com.callor.game

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.callor.game.databinding.ActivityMainBinding
import com.callor.game.ui.FRAGMENT_MAIN
import com.callor.game.ui.FRAGMENT_RESULT
import com.callor.game.ui.MainFragment
import com.callor.game.ui.ResultFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    } // end Create
    /**
     * Activity -> Fragment 의 계층구조로 만들어진 UI 구조에서
     * Activity 아래의 다수의 Fragment 가 서로 화면을 교환하고자 할때
     * Fragment 들 간은 형제간 이기 때문에 형제끼리 교환이 불가능 하다
     * 이때는 Activity 에 Fragment 를 교환(Replace) 할수 있는 함수를 만들어 두고
     * 각 Fragment 에서 Activity 의 함수를 호출하여 Fragment 를 교환 해야 한다
     */
    fun changeFragment(fragmentName : String) {

        // fragmentName 문자열 값에 따라
        // fragment 에는 Result 또는 Main Fragment 자체가 담기게 된다
        val fragment : Fragment = when(fragmentName) {
            FRAGMENT_RESULT-> ResultFragment()
            FRAGMENT_MAIN-> MainFragment()
            else-> MainFragment()
        }
        /**
         * fragmentName 값이 없이 이 함수가 호출되는 경우는 "거의 없을 것이다"
         * 때문에 fragment 에는 null 이 담길 확률이 "매우 낮다"
         * fragment 변수 뒤에 !! 연산자를 붙여서 null safe 코드를 만들었다
         * 하지만 함수를 호출하는 곳에 문자열 중에 글자를 빼먹거나
         * 대소문자를 잘못사용하면 null 이 될것이다
         */
//        if(fragment != null) {

            supportFragmentManager
                .beginTransaction()
                .replace(binding.fragmentContainerView.id,fragment)
                .commit()

//        }
    }
}