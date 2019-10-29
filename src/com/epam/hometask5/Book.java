package com.epam.hometask5;

public class Book {

    private int id;
    private String name;
    private String author;
    private String publish;
    private int year;
    private int pages;
    private int cost;

    public Book(int id, String name, String author, String publish, int year, int pages, int cost) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publish = publish;
        this.year = year;
        this.pages = pages;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void view() {
        System.out.println("Name " + getName() +
                " Auther " + getAuthor()+
                " Publish house " + getPublish()+
                " Year " + getYear()+
                " Pages " + getPages()+
                " Cost " + getCost()
        );
    }

}
