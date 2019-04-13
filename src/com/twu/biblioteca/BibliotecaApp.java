package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BibliotecaApp {

    private static List<Book> books = new Library().getBooks();
    private static List<Book> libraryBooks;

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
            case 2:
                checkoutBookProcess();
                break;
            case 3:
                returnBookProcess();
                break;
            default:
                System.out.println("Error choose");

        }
    }

    private void returnBookProcess() {
        System.out.print("Please input the book name what you want to return: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        boolean result = returnBook(name);
        if(result) {
            System.out.println("Thank you for returning the book!");
        } else {
            System.out.println("That is not a valid book to return!");
        }
    }

    private void checkoutBookProcess() {
        System.out.print("Please input the book name what you want to checkout: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        boolean result = checkoutBook(name);
        if(result) {
            System.out.println("Thank you! Enjoy the book!");
        } else {
            System.out.println("Sorry, that book is not available!");
        }

    }

    public boolean returnBook(String name) {
        boolean result = false;
        for(Book book : books) {
            if(book.getName().equals(name) && book.isCheckout() == false) {
                showBook(book);
                result = true;
                break;

            }
        }
        return result;
    }

    public boolean checkoutBook(String name) {
        boolean result = false;
        for(Book book : books) {
            if(book.getName().equals(name) && book.isCheckout() == false) {
                book.setCheckout(true);
                result = true;
                break;
            }
        }
        return result;
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
