package com.chrzha.code.optimization.design.singleton;

/**
 * Created by chrzha on 17-3-11.
 */
public class Singleton {

    static {
        System.out.println("0. static block");
    }

    private Singleton() {
        System.out.println("3. private Singleton constructure");
    }

    private static class SingletonPlaceholder{
        static {
            System.out.println("2. static inner class");
        }
        private static Singleton _instance = new Singleton();
    }

    public static Singleton getInstance(){
        System.out.println("1. getInstance");
        return SingletonPlaceholder._instance;
    }

    public static void main(String[] args){
        Singleton singleton1 = getInstance();
        //Singleton singleton2 = getInstance();
        //Singleton singleton3 = getInstance();

    }
}
