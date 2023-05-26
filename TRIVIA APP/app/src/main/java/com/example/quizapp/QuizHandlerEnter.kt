package com.example.quizapp

object QuizHandlerEnter {
    fun getQuestions(): ArrayList<Question> {

        return arrayListOf(
            Question(
                "In the Doctor Who universe, how many times can a time lord normally regenerate?",
                "11",
                "12",
                "13",
                "15",
                "12"
            ),
            Question(
                "Which actor from The Young Ones also played Lord Flashheart in one episode of Blackadder II?",
                "Adrian Edmondson",
                "Rik Mayall",
                "Nigel Planer",
                "Christopher Ryan",
                "Rik Mayall"
            ),
            Question(
                "In what year did The Big Bang Theory debut on CBS?",
                "2006",
                "2007",
                "2008",
                "2009",
                "2007"
            ),
            Question(
                "In the original Star Trek TV series, what was Captain James T. Kirks middle name?",
                "Tiberius",
                "Trevor",
                "Travis",
                "Tyrone",
                "Tiberius"
            ),
            Question(
                "What breed of dog is Scooby Doo?",
                "Pit bull",
                "Boxer",
                "Great Dane",
                "Doberman Pinscher",
                "Great Dane"
            )


        )
    }

}