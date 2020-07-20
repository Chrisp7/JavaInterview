package com.pat.javabasisc.thread;

public class CycleWait implements Runnable {
    private String value;

    public void run() {
        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        value = "we have data now";
    }

    public static void main(String[] args) throws InterruptedException {
        CycleWait cw = new CycleWait();
        Thread t1 = new Thread(cw);
        t1.start();
        /**
         * 1. 循环等待法

        while (cw.value == null) {
            Thread.currentThread().sleep(100);
        }
        */
        /**
         * 2. join阻塞法

        t1.join();
         */

        System.out.println("value: " + cw.value);
    }
}
