package com.example.quizapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class Score:Fragment() {
    lateinit var btGoHome: Button
    lateinit var tvResult: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.score, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvResult =  view.findViewById(R.id.tvResult)
        tvResult.text = (requireArguments().getInt("result").toString()) + "/5"
        btGoHome =  view.findViewById(R.id.btGoHome)
        btGoHome.setOnClickListener {
            findNavController().navigate(R.id.action_score_to_intropage)
        }

    }
}
