package com.twu.biblioteca;

public class Movie {
    private String name;
    private  String year;
    private  String director = "";
    private  String rating = "";

    private boolean checkout;

    public Movie(String name, String year, boolean checkout) {
        this.name = name;
        this.year = year;
        this.checkout = checkout;
    }

    public Movie(String name, String year, String director, String rating, boolean checkout) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
        this.checkout = checkout;
    }

    public void printMovieInfo() {
        String info = "";
        if(!name.isEmpty()) info += "Name: " + name;
        if(!year.isEmpty()) info += ", Year: " + year;
        if(!director.isEmpty()) info += ", Director: " + director;
        if(!rating.isEmpty()) info += ", Rating: " + rating;

        System.out.println(info);
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

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
