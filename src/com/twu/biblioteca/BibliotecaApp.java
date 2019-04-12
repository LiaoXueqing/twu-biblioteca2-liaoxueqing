package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {
    private static List<Book> books;

    public static void main(String[] args) {
        welcome();
        BibliotecaApp app = new BibliotecaApp();
        books = new Library().getBooks();
        app.showBooks(books);

    }

    public void showBooks(List<Book> books) {
        for (Book book : books) {
            System.out.println(book.getName());
        }
    }


    public static void welcome() {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
    }
}
