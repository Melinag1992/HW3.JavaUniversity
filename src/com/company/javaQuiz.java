package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class javaQuiz {
    public static void welcomeQuiz() {
        Scanner newScan = new Scanner(System.in);
        System.out.println("Welcome to Java Quiz. Where we will test your knowledge on Java. My name is Emily, I was created by a bunch of amazing coders's at Coalition for Queens. What's your name? ");
        String userName = newScan.nextLine();
        System.out.println("Nice to meet you " + userName + " let's begin.\n");
        System.out.println("\nPlease type in the corresponding letter to the answer of choice.\n");
        questions();

    }

    public static void questions() {
        Scanner newScan2 = new Scanner(System.in);
        String correct = "You are correct!";
        String wrong = "You are incorrect.";
        int counter = 0;

        for (int i = 0; i <=4; i++) {

            switch (i) {
                case 1:
                    Scanner newScan3 = new Scanner(System.in);
                    System.out.println("what is a parameter?");
                    System.out.println(" a) A parameter is the input of a method.\n b) Java Virtual Machine.\n c) A block that holds your values.");
                    String userChar = newScan3.nextLine().toLowerCase();
                    if (userChar.equals("a")) {
                        System.out.println(correct);
                        counter++;
                        System.out.println("You have " + counter + " out of 4 correct");
                    } else {
                        System.out.println(wrong);
                    }
                    break;
                case 2:
                    Scanner newScan4 = new Scanner(System.in);
                    System.out.println("What is a JVM?");
                    System.out.println("\n a) A virtual machine that interprets Java bytecode and enables your computer to run it as a program. \n b) A software package that contains what is needed to run a Java program. \n c) The input of a method.");
                    String userChar1 = newScan4.nextLine().toLowerCase();
                    if (userChar1.equals("a")) {
                        counter++;
                        System.out.println(correct);
                        System.out.println("You have " + counter + " out of 4 correct");
                    } else {
                        System.out.println(wrong);
                    }
                    break;
                case 3:
                    Scanner newScan5 = new Scanner(System.in);
                    System.out.println("What is JRE?");
                    System.out.println("\n a) A Java Development Kit. \n b) A virtual machine that interprets Java bytecode. \n c) A software package that contains what is needed to run a Java program (including the JVM).");
                    String userChar2 = newScan5.nextLine();
                    if (userChar2.equals("c")) {
                        System.out.println(correct);
                        counter++;
                        System.out.println("You have " + counter + " out of 4 correct");
                        break;
                    } else {
                        System.out.println(wrong);
                        break;
                    }

                case 4:
                    Scanner newScan6 = new Scanner(System.in);
                    System.out.println("What are the primitive types?");
                    System.out.println("\n a) boolean , byte , char , short , int , long , float and double. \n b) boolean, string, number , byte, int, and true\n c) true , false, string, numbers, object, and arrays");
                    String userChar3 = newScan6.nextLine();
                    if (userChar3.equals("a")) {
                        System.out.println(correct);
                        counter++;
                        System.out.println("You have " + counter + " out of 4 correct");
                    } else {
                        System.out.println(wrong);
                    }
                    break;
                default:
                    continue;

//                    AskTrainOrQuiz.trainerOrQuiz();
            }
        }
    }
}


