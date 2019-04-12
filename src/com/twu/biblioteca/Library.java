package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<Book>(){
            {
                add(new Book("book1"));
                add(new Book("book2"));
                add(new Book("book3"));
                add(new Book("book4"));
            }
        };
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
