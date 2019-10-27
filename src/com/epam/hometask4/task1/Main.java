package com.epam.hometask4.task1;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = createArray(10);
        System.out.println(Arrays.toString(array));
        int[] array2 = reverseArray(array);

        System.out.println(Arrays.toString(array2));
    }

    public static int[] createArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200) - 100;
        }
        return array;
    }

    public static int[] reverseArray(int[] array) {

        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            array2[array2.length - 1 - i] = number;
        }
        return array2;
    }
}
