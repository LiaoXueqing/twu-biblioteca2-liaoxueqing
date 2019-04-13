package com.twu.biblioteca;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BibliotecaApp {

    private static List<Book> books;
    private final static Map<Integer, String> MemuOptions = new HashMap<Integer, String>(){
        {
            put(1, "List of books");
        }
    };

    public static void main(String[] args) {
        welcome();
        BibliotecaApp app = new BibliotecaApp();
        app.chooseMenu();
    }

    public void chooseMenu() {
        Menu menu = new Menu();
        boolean isExit = false;

        do {
            menu.printInfo();
            int result = menu.getInput();
            if(menu.checkResult(result)) {
                if(result == 0){
                    isExit = true;
                } else {
                    doHandle(result);
                }

            } else {
                System.out.println("Please select a valid option!");
            }

        } while(!isExit);

    }

    public void doHandle(int result) {
        switch (result) {
            case 1:
                books = new Library().getBooks();
                showBooks(books);
                break;

            default:
                System.out.println("Error choose");

        }
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
