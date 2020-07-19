package com.pat.javabasisc.thread;

public class ThreadTest {
    public static void attack() {
        System.out.println("fight");
        System.out.println("current thread is : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            attack();
        });
        System.out.println("current main thread is : " + Thread.currentThread().getName());
        t.run();
        t.start();

    }
}
