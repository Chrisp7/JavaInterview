package com.pat.javabasisc.thread;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        String value = "test";
        System.out.println("Read to work");
        Thread.currentThread().sleep(3000);
        System.out.println("task done");
        return value;
    }
}