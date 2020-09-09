package com.zuitt.app;

public class Customer extends User {

    public void order() {
        System.out.println("Ordering");
    }

    public void viewTransactions() {
        System.out.println("Viewing transactions");
    }

    public void pay() {
        System.out.println("Paying");
    }
}
