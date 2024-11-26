package org.example;

public class Task6 {

// Что в консоли?

    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("1");
                Thread.sleep(2000);
                System.out.println("2");
            } catch (InterruptedException e) {

            }
        });

        thread.run();

        System.out.println("3");

        throw new RuntimeException("4");
    }
}