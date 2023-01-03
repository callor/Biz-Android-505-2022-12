package com.callor.app_007

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.callor.app_007.databinding.FragmentMainBinding
import com.google.android.material.snackbar.Snackbar

class MainFragment : Fragment() {

    private var _binding : FragmentMainBinding ? = null
    private val binding get() = _binding!!

    /**
     * Activity 에서는 주로 onCreate method 에서 view 를 만들고
     * binding 을 수행했는데
     * Fragment 에서는 onCreateView Method 에서 수행한다
     */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        // LayoutInflater 와 ViewGroup 을 사용하여 binding 수행하기
        _binding = FragmentMainBinding.inflate(inflater,container, false)

        // binding 객체가 정상적으로 생성되어 있을때만 .root 값을 getter 하여
        // root 변수에 할당하라
        // !! : 절대 null 금지
        val root:View = binding!!.root
        binding!!.btnGoSub.setOnClickListener {
//            Snackbar.make(it,"안녕~!!", Snackbar.LENGTH_LONG).show()
//            findNavController().navigate(R.id.action_mainFragment_to_subFragment)

            /**
             * fragment 간에 안전한 데이터 교환을 하기 위한 도구
             * safe-args-plugin 을 설치하면
             * Fragment 에 따라서 FragmentDirections 클래스가 자동 생성된다.
             * Directions 에게 값을 저장하여 다른 fragment 로 전달한다
             */
            val action = MainFragmentDirections.actionMainFragmentToSubFragment()
            action.word = binding!!.inputWord.text.toString()
            // action.age = 30
            findNavController().navigate(action)

        }

        return root
        // return inflater.inflate(R.layout.fragment_main, container, false)
    }
}