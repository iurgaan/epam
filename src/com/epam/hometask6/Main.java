package com.epam.hometask6;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle("red", 10),
                new Circle("white", 5),
                new Circle("black", 15),
                new Circle("green", 20),
                new Circle("blue", 10),
                new Circle("blue", 25),
                new Rectangle("red", 10, 5),
                new Rectangle("white", 20, 15),
                new Rectangle("black", 25, 10),
                new Rectangle("green", 30, 18),
                new Rectangle("blue", 35, 20),
                new Triangle("red", 10, 5, 8),
                new Triangle("white", 15, 10, 10),
                new Triangle("black", 20, 15, 18),
                new Triangle("green", 30, 20, 28),
                new Triangle("blue", 40, 25, 38)
        };
        for (Shape element : shapes) {
            element.draw();
        }
//    Arrays.sort(shapes);
        Arrays.sort(shapes, new MyComparatorColor());

        System.out.println("Sort:");
        for (Shape element : shapes) {
            element.draw();
        }
        double allArea = calcAllArea(shapes);
        System.out.println("All area= " + allArea);
    }

    public static double calcAllArea(Shape[] shapes) {
        double allArea = 0;
        for (Shape element : shapes) {
            allArea = element.calcArea() + allArea;
        }
        return allArea;
    }
}