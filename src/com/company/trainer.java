package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class trainer{

    public static void runTrainer() {
        System.out.println("Hi, welcome to java-trainer 1.0. Type in a java term you would like to learn more about:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // we were missing the "Line" ( .nextLine() ) on the scanner object and the argument passed in (System.in) . It was not receiving any inputs.
        String loIn = input.toLowerCase();

        List<String> jTerm = new ArrayList<>(Arrays.asList("parameter", "jdk", "variables", "java runtime environment", "java virtual machine ", "java"));
        int n;


        if (loIn.equals("parameter")) { // when we were comparing values initially  we were calling the wrong operator / since it is a list we are to use the .equals() method. instead of the  " == "
            n = 0;
            defVocab(n);
        } else if (loIn.equals("jdk") || loIn.equals("java development kit")) {
            n = 1;
            defVocab(n);
        } else if (loIn.equals("variables")) {
            n = 2;
            defVocab(n);
        } else if (loIn.equals("java runtime environment") || loIn.equals("jre")) {
            n = 3;
            defVocab(n);
        } else if (loIn.equals("java virtual machine") || loIn.equals("jvm")) {
            n = 4;
            defVocab(n);
        } else if (loIn.equals("primitive types")) {
            n = 5;
            defVocab(n);
        } else {
            n = 6;
            defVocab(n);
        }

    }

    public static void defVocab(int n) {
        Scanner scan = new Scanner(System.in);
        switch (n) {
            case 0:
                System.out.println("A parameter is the input of a method, the type of your input must match the one declared in said method when used. for example \n \n public static void printHello(){\n String n = \"Hello World!\"; \n System.out.print(n);\n} \n // prints out \"Hello World!\" to the console");
                break;
            case 1:
                System.out.println("Java Development Kit also known as 'JDK', contains the basics needed to develop a Java program (including the JRE as well as tools such as javac)");
                break;
            case 2:
                System.out.println("Variables are placeholders for real values. They can be stored and manipulated. Usually written in CamelCase");
                break;
            case 3:
                System.out.println("Java Runtime Environment also known as 'JRE', a software package that contains what is needed to run a Java program (including the JVM)");
                break;
            case 4:
                System.out.println("Java Virtual Machine also known as 'JVM', a virtual machine that interprets Java bytecode and enables your computer to run it as a program");
                break;
            case 5:
                System.out.println("Primitive types are the most basic data types available within the Java language. \nThere are 8: boolean , byte , char , short , int , long , float and double . \nThese types serve as the building blocks of data manipulation in Java");
                break;
            default:
                System.out.println("It is not in my vocabulary but try another word! \n \"Type in hint if you would like a 'Hint' or two ;)  or 'exit' to leave training :( \"");
                hint();
                break;

        }
    }

    public static void hint() {
        Scanner scan2 = new Scanner(System.in);
        String input2 = scan2.nextLine();
        String loIn2 = input2.toLowerCase();

        if (loIn2.equals("hint")) {
            System.out.println("choose one of these words: \n   \"parameter\", \"jdk\", \"variables\", \"jre\", \"jvm\",\"java\" and try one more time...");
            System.out.println("  \n \n Now you know for next time...let's run the game one more time.");
        } else if (loIn2.equals("exit")) {
            System.out.println("Thanks for playing today.");
        } else {
            System.out.println("You must of spelled 'Hint' wrong buddy!");
        }
    }
}
