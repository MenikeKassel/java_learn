package com.homework18;

public class Thread01 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread is processing");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        Thread01 thread = new Thread01();
        thread.start(); // Start the new thread

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("main is processing");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
