package com.pat.javabasisc.jvm.gc;

public class Finalization {
    public static Finalization f;

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalized");
        f = this;
    }

    public static void main(String[] args) {
        Finalization finalization = new Finalization();
        System.out.println("first time: " + finalization);
        finalization = null;
        System.gc();
        System.out.println("second time: " + finalization);
        System.out.println("inside finalization: " + finalization.f);

    }
}
