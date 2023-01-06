package com.callor.student.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.callor.student.databinding.FragmentMainListBinding

class MainListFragment : Fragment() {

    private lateinit var binding : FragmentMainListBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainListBinding.inflate(inflater, container, false)
        return binding.root
    }
}