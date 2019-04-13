package com.twu.biblioteca;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BibliotecaApp {

    private static List<Book> books = new Library().getBooks();
    private static List<Book> libraryBooks;
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
                showBooks(books);
                break;

            default:
                System.out.println("Error choose");

        }
    }

    public void checkoutBook(String name) {
        for(Book book : books) {
            if(book.getName() == name) {
                book.setCheckout(true);
            }
        }
    }

    public void showBooks(List<Book> books) {
        libraryBooks = books.stream().filter(item -> !item.isCheckout()).collect(Collectors.toList());
        for (Book book : libraryBooks) {
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
