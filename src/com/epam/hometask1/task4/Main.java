package com.epam.hometask1.task4;

public class Main {
    public static void main(String[] args) {

        double deposit = 10000;
        double ratePerYear = 12;
        int term = 6;
        double income = deposit * (term * ratePerYear / 12) / 100;

        System.out.println("Result -> " + income);
    }
}
