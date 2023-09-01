package com.example.lesson_7_homework

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.lesson_7_homework.databinding.FragmentFirstBinding
import com.example.lesson_7_homework.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var result: Persons = arguments?.getSerializable("key") as Persons
        binding.tvCharacterName.text = result.name
        binding.ivSingleCharacter.setImageResource(result.image)
        binding.tvCharacterStatus.text = result.status
    }

}
