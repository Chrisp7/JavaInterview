package com.pat.javabasisc.jvm.gc;

import jdk.swing.interop.SwingInterOpUtils;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class WeakReferenceOfNormalObject extends WeakReference<NormalObject> {
    public String name;

    public WeakReferenceOfNormalObject(NormalObject normalObject, ReferenceQueue<NormalObject> rq) {
        super(normalObject, rq);
        this.name = normalObject.name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("WeakReferenceOfNormalObject finalize method: " + name);
    }
}
