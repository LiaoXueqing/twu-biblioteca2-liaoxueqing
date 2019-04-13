package com.twu.biblioteca;

public class Movie {
    private String name;
    private  String year;
    private boolean checkout;

    public Movie(String name, String year, boolean checkout) {
        this.name = name;
        this.year = year;
        this.checkout = checkout;
    }

    public void printMovieInfo() {
        System.out.println("Name: " + name + "，Year: " + year);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public boolean isCheckout() {
        return checkout;
    }

    public void setCheckout(boolean checkout) {
        this.checkout = checkout;
    }
}
