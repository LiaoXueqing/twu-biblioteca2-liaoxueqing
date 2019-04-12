package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {
    private List<Book> books;

    public static void main(String[] args) {
        welcome();
        BibliotecaApp app = new BibliotecaApp();
        List<Book> books = new ArrayList<Book>(){
            {
                add(new Book("book1"));
                add(new Book("book2"));
                add(new Book("book3"));
                add(new Book("book4"));
            }
        };
        app.showBooks(books);

    }

    public void showBooks(List<Book> books) {
        for (Book book : books) {
            printBook(book);
        }
    }

    private void printBook(Book book) {
        System.out.println(book.getName());
    }

    public static void welcome() {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
    }
}
