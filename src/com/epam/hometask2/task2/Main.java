package com.epam.hometask2.task2;

public class Main {
    public static void main(String[] args) {
        int line2 =0;
        while (line2 <=5) {
            int space = line2;
            int digit2 = 5 - line2;
            while (space > 0) {
                System.out.print(" ");
                space --;
            }
            while (digit2 > 0) {
                System.out.print("*");
                digit2--;
            }

            System.out.println();
            line2 ++;
        }
    }
}
