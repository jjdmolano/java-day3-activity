package com.zuitt.app;

public class User {
    private Account account;

    public void register() {
        System.out.println("Registering");
    }

    public void login() {
        System.out.println("Logging in");
    }

    public void logout() {
        System.out.println("Logging out");
    }
}
