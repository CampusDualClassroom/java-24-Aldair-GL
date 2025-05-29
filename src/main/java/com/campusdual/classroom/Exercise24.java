package com.campusdual.classroom;

import java.util.LinkedList;
import java.util.Queue;

public class Exercise24 {
    public static Queue<String> createQueue() {
        Queue<String> instruments = new LinkedList<>();

        instruments.offer("Smith");
        instruments.offer("Montessori");
        instruments.offer("Peralta");
        instruments.offer("House");
        for (String instruments2 : instruments){
            System.out.println(instruments2);
        }
        return instruments;
    }
    public static void printAndEmptyQueue(Queue<String> queue) {
        System.out.println("\nRemoved Elements");
        String removedInstruments=queue.poll();
        String removedInstruments2=queue.poll();
        String removedInstruments3=queue.poll();
        String removedInstruments4=queue.poll();

        System.out.println("\nQueue after removed");
        for (String instruments2 : queue){
            System.out.println(instruments2);
        }

    }

    public static void main(String[] args) {
    Queue<String> cola=createQueue();
    printAndEmptyQueue(cola);
    }

}
