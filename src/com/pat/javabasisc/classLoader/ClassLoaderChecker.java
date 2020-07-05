package com.pat.javabasisc.classLoader;

public class ClassLoaderChecker {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        MyClassLoader m = new MyClassLoader("/Users/patchen/Desktop/","myClassLoader");
        Class c = m.loadClass("Wali");
        System.out.println(c.getClassLoader());
        c.newInstance();
    }
}
