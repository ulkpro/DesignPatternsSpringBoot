package com.example.designpatterns.singleton;

public class SingletonExamplesRunner {

    public String run() {
        StringBuilder result = new StringBuilder();

        BasicSingleton b1 = BasicSingleton.getInstance();
        BasicSingleton b2 = BasicSingleton.getInstance();
        result.append(b1.connect()).append(" | Same instance: ").append(b1 == b2).append("\n");

        ThreadSafeSingleton t1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton t2 = ThreadSafeSingleton.getInstance();
        result.append(t1.connect()).append(" | Same instance: ").append(t1 == t2).append("\n");

        StaticBlockSingleton s1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton s2 = StaticBlockSingleton.getInstance();
        result.append(s1.connect()).append(" | Same instance: ").append(s1 == s2).append("\n");

        result.append(EnumLogger.INSTANCE.log("App started")).append(" | Enum name: ").append(EnumLogger.INSTANCE.name()).append("\n");

        return result.toString();
    }
}