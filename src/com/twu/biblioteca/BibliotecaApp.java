package com.twu.biblioteca;

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
            showBook(book);
        }
    }

    public void showBook(Book book) {
        System.out.println("Name:"+book.getName()+" Author:"+book.getAuthor()+" Year:"+book.getYear());
    }

    public static void welcome() {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
    }
}
