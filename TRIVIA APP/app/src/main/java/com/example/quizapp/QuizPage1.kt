package com.example.quizapp

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController


class QuizPage1 : Fragment(), View.OnClickListener {

    lateinit var tvCount: TextView
    lateinit var tvQuestion: TextView
    lateinit var btOption1: Button
    lateinit var btOption2: Button
    lateinit var btOption3: Button
    lateinit var btOption4: Button
    lateinit var tvScore : TextView

    var currentQuestionIndex = 0
        val listOfQuestion = QuizHandlerComp.getQuestions()


    lateinit var currentQuestion: Question
    var score = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.quespage, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvCount = view.findViewById(R.id.tvCount)
        tvQuestion = view.findViewById(R.id.tvQuestion)
        btOption1 = view.findViewById(R.id.btOption1)
        btOption2 = view.findViewById(R.id.btOption2)
        btOption3 = view.findViewById(R.id.btOption3)
        btOption4 = view.findViewById(R.id.btOption4)
        btOption4 = view.findViewById(R.id.btOption4)
        tvScore = view.findViewById(R.id.tvScore)


        btOption1.setOnClickListener(this)
        btOption2.setOnClickListener(this)
        btOption3.setOnClickListener(this)
        btOption4.setOnClickListener(this)

        displayQuestion()
    }

    fun displayQuestion() {
        if (currentQuestionIndex >= listOfQuestion.size) {
            //navigate to results
            val bundle = Bundle()
            bundle.putInt("result", score)
            findNavController().navigate(R.id.action_quespage_to_score, bundle)
            return
        }
        currentQuestion = listOfQuestion[currentQuestionIndex++]
        tvCount.text = "Question "+ (currentQuestionIndex.toString()) + " of 5"
        tvScore.text="score: " + score.toString()
        tvQuestion.text = currentQuestion.question
        btOption1.text = currentQuestion.option1
        btOption2.text = currentQuestion.option2
        btOption3.text = currentQuestion.option3

    }
    fun displayCongrats(){

    }
    fun displayWrong(){

    }

    override fun onClick(v: View?) {
        //compare results
        val selectedOption = when (v?.id) {
            R.id.btOption1 -> currentQuestion.option1
            R.id.btOption2 -> currentQuestion.option2
            R.id.btOption3 -> currentQuestion.option3
            else -> currentQuestion.option4
        }

        if (selectedOption.equals(currentQuestion.answer)) {
            score++



            }
        else{

        }


        displayQuestion()
    }


}
