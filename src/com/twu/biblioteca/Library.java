package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<Book>(){
            {
                add(new Book("book1", "sanmao", "1982", true));
                add(new Book("book2", "xiaoyu", "1978", false));
                add(new Book("book3", "jingyong", "1957", false));
                add(new Book("book4", "doudou", "1982", false));
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
