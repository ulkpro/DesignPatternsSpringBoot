package com.example.designpatterns.singleton;

public class ThreadSafeSingleton {
    //volatile prevents reordering of instructions at the JVM
    private static volatile ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){
        System.out.println("Create ThreadSafeSingleton");
    }

    //Only one thread at a time can enter the synchronized block
    public static ThreadSafeSingleton getInstance(){
        if (instance == null){
            synchronized (ThreadSafeSingleton.class){
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    public String connect(){
        return "Connected using thread safe singleton";
    }
}
