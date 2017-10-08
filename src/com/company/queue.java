package com.company;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {

        Queue<String> myStrQ = new LinkedList<>();
        myStrQ.offer("Arsenal");
        myStrQ.offer("Barcelona");
        myStrQ.offer("Chelsea");
        myStrQ.offer("Bayern Munich");
        myStrQ.offer("Real Madrid");
        myStrQ.offer("Juventus");
        myStrQ.offer("PSG");
        myStrQ.offer("Dortmund");
        myStrQ.offer("Manchester United");
        myStrQ.offer("Manchester City");
        printQueue(myStrQ);

    } public static void printQueue(Queue<String> myStrQ){

        while(myStrQ.poll() != null){
            try{
                System.out.println(myStrQ.poll());
            } catch(EmptyStackException e){
                System.out.println("All Empty");

            }
        }

    }
}
