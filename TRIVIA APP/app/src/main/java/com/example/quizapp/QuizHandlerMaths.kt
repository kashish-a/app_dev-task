package com.example.quizapp

object QuizHandlerMaths {
    fun getQuestions(): ArrayList<Question> {

        return arrayListOf(
            Question(
                "In the hexadecimal system, what number comes after 9?",
                "16",
                "10",
                "A",
                "0",
                "A"
            ),
            Question(
                "What is the correct order of operations for solving equations?",
                "Addition, Multiplication, Division, Subtraction, Addition, Parentheses",
                "Parentheses, Exponents, Addition, Substraction, Multiplication, Division",
                "Parentheses, Exponents, Multiplication, Division, Addition, Subtraction",
                "The order in which the operations are written.",
                "Parentheses, Exponents, Multiplication, Division, Addition, Subtraction"
            ),
            Question(
                "In the complex plane, multiplying a given function by i rotates it anti-clockwise by how many degrees?",
                "90",
                "180",
                "270",
                "0",
                "90"
            ),
            Question(
                "What is the smallest number that can be expressed as the sum of two positive cubes in two different ways?",
                "91",
                "561",
                "4104",
                "1729",
                "1729"
            ),
            Question(
                "How many sides does a trapezium have?",
                "3",
                "4",
                "5",
                "6",
                "4"
            )


        )
    }

}