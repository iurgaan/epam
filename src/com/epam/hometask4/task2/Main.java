package com.epam.hometask4.task2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array1 = createArray(10);
        int[] array2 = createArray(10);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        int [] array3= sumTwoArrays(array1, array2);

        System.out.println(Arrays.toString(array3));
    }

    public static int[] createArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(200) - 100;
        }
        return array;
    }

    public static int[] sumTwoArrays(int[] a1, int[] a2) {
        int[] array3 = new int[a1.length];

        for (int i = 0; i < array3.length; i++) {
            int number1 = a1[i];
            int number2 = a2[i];
            array3[i] = number1 + number2;
        }
        return array3;
    }
}
