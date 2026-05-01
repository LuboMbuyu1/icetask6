package org.example;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner input =  new Scanner(System.in);

    // create question object

        Question[] questions =  {
                new Question(
                        "Who is known as the King of Pop?",
                        new String[]{"Drake", "Michael Jackson", "Chris Brown", "Eminem"},
                        2
                ),

                new Question(
                        "Which instrument has 88 keys?",
                        new String[]{"Guitar", "Drums", "Piano", "Violin"},
                        3
                ),

                new Question(
                        "Which artist released the album '25'?",
                        new String[]{"Adele", "Rihanna", "Taylor Swift", "Beyonce"},
                        1
                ),

                new Question(
                        "Which genre does Kendrick Lamar mainly perform?",
                        new String[]{"Jazz", "Hip Hop", "Rock", "Country"},
                        2
                ),

                new Question(
                        "Which singer performed 'Blinding Lights'?",
                        new String[]{"The Weeknd", "Drake", "Post Malone", "Bruno Mars"},
                        1
                ),

                new Question(
                        "Which country is K-Pop from?",
                        new String[]{"Japan", "China", "South Korea", "Thailand"},
                        3
                ),

                new Question(
                        "What does DJ stand for?",
                        new String[]{"Dance Jam", "Disc Jockey", "Digital Jam", "Drum Jockey"},
                        2
                ),

                new Question(
                        "Which singer is famous for 'Bad Guy'?",
                        new String[]{"Billie Eilish", "Ariana Grande", "Doja Cat", "SZA"},
                        1
                ),

                new Question(
                        "Which symbol in music represents silence?",
                        new String[]{"Sharp", "Flat", "Rest", "Clef"},
                        3
                ),

                new Question(
                        "Which artist sings 'Shape of You'?",
                        new String[]{"Coldplay", "Maroon 5", "Ed Sheeran", "One Direction"},
                        3
                )
        };

        int correct = 0;
        int incorrect = 0;

        StringBuilder heading = new StringBuilder();

        heading.append("=================================\n")
                .append("       WELCOME TO THE QUIZ\n")
                .append("=================================");

        System.out.println(heading);

        // Loop through quiz
        for (Question q : questions) {

            q.displayQuestion();

            System.out.print("Enter your answer (1-4): ");
            int answer = input.nextInt();

            boolean result = q.checkAnswer(answer);

            if (result) {
                correct++;
            }
            else {
                incorrect++;
            }
        }

        // Calculate percentage
        double percentage = ((double) correct / questions.length) * 100;

        // Build final report
        StringBuilder results = new StringBuilder();

        results.append("\n=================================\n")
                .append("          QUIZ RESULTS\n")
                .append("=================================\n")
                .append("Correct Answers: ")
                .append(correct)
                .append("\n")
                .append("Incorrect Answers: ")
                .append(incorrect)
                .append("\n")
                .append("Percentage: ")
                .append(String.format("%.2f", percentage)) // String Manipulator
                .append("%\n");

        // Additional String Manipulation
        if (percentage >= 70) {

            results.append("Status: PASS").append("\n");
        }
        else {

            results.append("Status: FAIL").append("\n");
        }

        System.out.println(results);

        input.close();
    }
}

