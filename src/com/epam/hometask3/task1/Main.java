package com.epam.hometask3.task1;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter word -> ");
        String str1 = sc.next();
        printUnique(str1);
    }

    public static void printUnique(String text) {
        int index = 0;
        while (index < text.length()) {
            char ch = text.charAt(index);
            int firstIndex = text.indexOf(ch);
            int lastIndex = text.lastIndexOf(ch);
            if (firstIndex == lastIndex) {
                System.out.print(ch + " ");
            }

            index++;

        }
    }
}
