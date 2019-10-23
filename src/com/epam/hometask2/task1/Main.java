package com.epam.hometask2.task1;

public class Main {

    public static void main(String[] args) {
        int line = 1;
        while (line <=5) {
            int digit = line;
            while (digit >0) {
                System.out.print("*");
                digit --;
            }
            System.out.println();
            line++;
        }
        int line2 =1;
        while (line2 <=5) {
            int digit2 = 5 - line2;
            while (digit2 > 0) {
                System.out.print("*");
                digit2--;
            }

            System.out.println();
            line2 ++;
        }
    }
}
