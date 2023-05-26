package com.example.quizapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation


class Tryagain1 :Fragment(){
    lateinit var buttonNext2: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.tryagain, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonNext2  =  view.findViewById(R.id.buttonnext2)
        buttonNext2.setOnClickListener {
            Navigation.findNavController(view).navigate(R.id.action_tryagain1_to_quespage1)
        }

    }

}