package com.mycompany.app;

/**
 * Hello world!
 its working fine
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }

    private final String getMessage() {
        System.out.println("this is it");
        return message;
    }

}
