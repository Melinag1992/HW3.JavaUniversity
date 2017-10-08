package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AskTrainOrQuiz {
    public static void trainerOrQuiz() {

        List<String> options = new ArrayList<>(Arrays.asList("quiz", "Java Trainer", "Train", "quit"));
        Scanner userIn = new Scanner(System.in);
        System.out.println("Welcome to Java university, where you can learn using our Java Trainer program or take a quiz to test your Java knowledge.");
        System.out.println("\nPlease type in \"Quiz\" to start quiz or \"Train\" to start learning. If you would like to exit Java university type in \"Quit\"");
        String answer = userIn.nextLine();
        String loAnswer = answer.toLowerCase();


        if (loAnswer.equals("quiz")) {
            System.out.println("You selected: Java Quiz");
            javaQuiz.welcomeQuiz();
        } else if (loAnswer.equals("train")) {
            System.out.println("You selected to train with our : Java Trainer");
            trainer.runTrainer();
        } else if (loAnswer.equals("quit")) {
            System.out.println("Sad to see you go. Goodbye!");

        } else {
            System.out.println("I am sorry but you need to select one of the following options.\n \" Quiz\" to take our Java Quiz ,\"Train\" to train with our Java Trainer  1.0 , or \"quit\" to exit Java University. ");

        }

    }
}
