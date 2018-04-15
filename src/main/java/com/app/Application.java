package com.app;

public class Application {
    public static void main(String [] args) {
        String env = System.getenv("APP_ENV");
        System.out.println("Hello world!");
        System.out.println("App environment is " + env);
    }
}