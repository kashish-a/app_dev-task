package com.example.quizapp


object QuizHandlerComp {
    fun getQuestions(): ArrayList<Question> {

        return arrayListOf(
            Question(
                "Whistler was the codename of this Microsoft Operating System.",
                "Windows XP",
                "Windows 2000",
                "Windows 7",
                "Windows 95",
                "Windows XP"
            ),
            Question(
                "What five letter word is the motto of the IBM Computer Company?",
                "Click",
                "Logic",
                "Pixel",
                "Think",
                "Think"
            ),
            Question(
                "In the programming language Java, which of these keywords would you put on a variable to make sure it doesn't get modified?",
                "Static",
                "Private",
                "Final",
                "Public",
                "Final"
            ),
            Question(
                "What is the most preferred image format used for logos in the Wikimedia database?",
                ".svg",
                ".png",
                ".jpeg",
                ".gif",
                ".svg"
            ),
            Question(
                "Which coding language was the #1 programming language in terms of usage on GitHub in 2015?",
                "C#",
                "JavaScript",
                "Python",
                "PHP",
                "JavaScript"
            )


        )
    }

}
