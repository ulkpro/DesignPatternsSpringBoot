    package com.example.designpatterns.singleton;

    //Two instances can create this at same time, not thread safe
    public class BasicSingleton {
        private static BasicSingleton instance;

        private BasicSingleton(){
            System.out.println("Created BasicSingleton Class");
        }

        public static BasicSingleton getInstance(){
            if (instance == null){
                instance = new BasicSingleton();
            }
            return instance;
        }

        public String connect(){
            return "Connected to BasicSingleton";
        }

    }
