package com.example.quizapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController

class GenreSelection:Fragment() {
    lateinit var buttonComp: Button
    lateinit var buttonMaths: Button
    lateinit var buttonGk: Button
    lateinit var buttonEnter: Button
    lateinit var genre:String
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.genreselection, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonComp  =  view.findViewById(R.id.comp)
        buttonMaths  =  view.findViewById(R.id.maths)
        buttonGk  =  view.findViewById(R.id.gk)
        buttonEnter  =  view.findViewById(R.id.enter)
        buttonComp.setOnClickListener {

            findNavController().navigate(R.id.action_genreselection_to_quespage1)
        }
        buttonMaths.setOnClickListener {

            findNavController().navigate(R.id.action_genreselection_to_quespage2)
        }
        buttonGk.setOnClickListener {

            findNavController().navigate(R.id.action_genreselection_to_quespage3)
        }
        buttonEnter.setOnClickListener {

            findNavController().navigate(R.id.action_genreselection_to_quespage4)
        }


    }
}