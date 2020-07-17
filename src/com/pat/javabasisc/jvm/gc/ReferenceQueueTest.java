package com.pat.javabasisc.jvm.gc;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.List;

public class ReferenceQueueTest {
    private static ReferenceQueue<NormalObject> rq = new ReferenceQueue<>();

    private static void checkQueue() {
        Reference<NormalObject> ref = null;
        while ((ref = (Reference<NormalObject>) rq.poll()) != null) {
            if (ref != null) {
                System.out.println("in queue: " + ((WeakReferenceOfNormalObject) ref).name);
                System.out.println("reference object: " + ref.get());
            }
        }
    }

    public static void main(String[] args) {
        List<WeakReferenceOfNormalObject> weakList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            weakList.add(new WeakReferenceOfNormalObject(new NormalObject("weak" + i), rq));
            System.out.println("create weak: " + weakList.get(i));
        }
        System.out.println("before calling checkQueue()");
        checkQueue();
        System.out.println("before calling system.gc()");
        System.gc();
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("after calling system.gc()");
        checkQueue();


    }
}
