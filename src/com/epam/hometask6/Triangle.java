package com.epam.hometask6;

public class Triangle extends Shape {
    private int a;
    private int b;
    private int c;

    public Triangle(String color, int a, int b, int c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", a=" + a +
                ", b=" + b +
                ", c=" + c;
    }

    @Override
    public double calcArea() {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public void draw() {
        System.out.printf("%s%s%7.2f%n", this.toString(),
                "; area=", this.calcArea());
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
