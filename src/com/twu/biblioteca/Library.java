package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<Book>(){
            {
                add(new Book("book1", "sanmao", "1982"));
                add(new Book("book2", "sanmao", "1982"));
                add(new Book("book3", "sanmao", "1982"));
                add(new Book("book4", "sanmao", "1982"));
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
