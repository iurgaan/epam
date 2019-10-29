package com.epam.hometask5;

import java.util.Arrays;

public class Books {
    private Book[] books;

    public Books(int size) {
        this.books = new Book[size];
    }

    public void add(Book book, int index) {
        this.books[index] = book;
    }

    public void view() {
        for (int i = 0; i < this.books.length; i++) {
            this.books[i].view();
        }
    }

    public void increasePrice(int index, int percent) {
        Book book = this.books[index];
        int price = book.getCost();
        price = price + (price * percent / 100);
        book.setCost(price);
    }

    public Book[] findBooks(String author) {
        Book[] foundedBooks = new Book[this.books.length];
        for (int i = 0; i < this.books.length; i++) {
            Book book = this.books[i];
            String author1 = book.getAuthor();
            if (author1.equals(author)) {
                foundedBooks[i] = book;
            }

        }
        return foundedBooks;

    }
}
