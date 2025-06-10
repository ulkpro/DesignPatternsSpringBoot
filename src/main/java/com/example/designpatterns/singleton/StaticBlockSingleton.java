package com.example.designpatterns.singleton;

//instance is created during class loading
public class StaticBlockSingleton {
    private static final StaticBlockSingleton instance = new StaticBlockSingleton();

    private StaticBlockSingleton(){
        System.out.println("StaticBlockSingleton Created");
    };

    public static StaticBlockSingleton getInstance(){
        return instance;
    }

    public String connect(){
        return "Connected to StaticBlockSingleton";
    }

}
