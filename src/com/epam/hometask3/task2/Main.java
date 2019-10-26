package com.epam.hometask3.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number -> ");
        int number = sc.nextInt();
        String number2 = binar(number);
        System.out.println(number2);
    }

    public static String binar(int a) {
        int b;
        String temp = "";
        while (a != 0) {
            b = a % 2;
            temp = temp + b;
            a = a / 2;
        }
        return temp;
    }
}
