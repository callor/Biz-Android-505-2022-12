package com.callor.game.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.callor.game.MainActivity
import com.callor.game.databinding.FragmentResultBinding
import com.callor.game.models.WordViewModel

class ResultFragment : Fragment() {

    private lateinit  var binding : FragmentResultBinding
    private val wordViewModel : WordViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentResultBinding.inflate(layoutInflater,container,false)
        return binding.root
    } // end CreateView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.lifecycleOwner = viewLifecycleOwner
        binding.wordViewModel = wordViewModel
        binding.btnReturn.setOnClickListener{
            val mainActivity = activity as MainActivity
            mainActivity.changeFragment(FRAGMENT_MAIN)
        }

        val inputText = wordViewModel.inputWord.value.toString()
        val unscrambleText = wordViewModel.unscrambleWord.value.toString()

        // if 를 사용하여 단어 비교

        // 점수 증가하기
        val oldScore = wordViewModel.gameScore.value!!.toInt()
        wordViewModel.gameScore.value = oldScore + 1

    }
}