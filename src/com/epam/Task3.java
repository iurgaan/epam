package com.epam;

public class Task3 {
    public static void main(String[] args) {
        double weightsPounds = 55;
        double weightGram = weightsPounds * 453.6;
        int kg = (int) weightGram / 1000;
        double gram = weightGram % 1000;

        System.out.println("Kg -> " + kg + " ,Gram -> " + gram);

    }
}
