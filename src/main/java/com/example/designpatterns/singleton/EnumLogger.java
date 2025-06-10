package com.example.designpatterns.singleton;

//JVM creates only one instance of EnumLogger
public enum EnumLogger {
    INSTANCE;

    public String log(String message){
        return "Logged" + message;
    }

}