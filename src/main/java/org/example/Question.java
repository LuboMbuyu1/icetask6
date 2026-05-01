package org.example;

public class Question {
    String questionText;
    String[] options;
    int correctAnswer;

    // Constructor
    public Question(String questionText, String[] options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    // Display question
    public void displayQuestion() {

        System.out.println("\n" + questionText);

        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    // Check answer
    public boolean checkAnswer(int userAnswer) {

        if (userAnswer == correctAnswer) {
            System.out.println("Correct! Well done!");
            return true;
        } else {
            System.out.println("Incorrect!");
            System.out.println("Correct answer: " + options[correctAnswer - 1]);
            return false;
        }
    }
}
