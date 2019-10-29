package com.epam.hometask5;

public class Main {

    public static void main(String[] args) {
        Books books = new Books(1);
        Book book = new Book(1,"Old man", "Heminguey", "Leo", 1980, 80, 100);
        books.add(book,0);
        books.view();
        books.increasePrice(0,5);
        books.view();
    }
}
