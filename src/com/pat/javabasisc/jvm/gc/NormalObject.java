package com.pat.javabasisc.jvm.gc;

public class NormalObject {
    public String name;

    public NormalObject(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Normal Object finalize method" + name);
    }
}
