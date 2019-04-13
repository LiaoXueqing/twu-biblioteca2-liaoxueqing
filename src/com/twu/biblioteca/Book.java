package com.twu.biblioteca;

public class Book {
    private String name;
    private String author;
    private  String year;
    private boolean checkout;

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, String author, String year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    public Book(String name, String author, String year, boolean checkout) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.checkout = checkout;
    }

    public boolean isCheckout() {
        return checkout;
    }

    public void setCheckout(boolean checkout) {
        this.checkout = checkout;
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

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
