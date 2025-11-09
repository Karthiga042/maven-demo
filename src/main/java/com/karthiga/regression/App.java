package com.karthiga.regression;

public class App {

    // method used by tests
    public String getMessage() {
        return "Hello from Maven Regression Project!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
    }
}
