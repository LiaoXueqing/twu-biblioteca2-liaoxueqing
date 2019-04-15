package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    Library library = new Library();
    MovieLibrary movieLibrary = new MovieLibrary();

    User loginUser = null;

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
                library.showBooks();
                break;
            case 2:
                checkoutBookProcess();
                break;
            case 3:
                returnBookProcess();
                break;
            case 4:
                login();
                break;
            case 5:
                viewCheckoutBooks();
                break;
            case 6:
                viewPersonalInformation();
                break;
            case 7:
                movieLibrary.showAvailableMovies();
                break;
            case 8:
                checkoutMovieProcess();
                break;
            default:
                System.out.println("Error choose");

        }
    }

    private void checkoutMovieProcess() {
        System.out.print("Please input the movie name what you want to checkout: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        boolean result = movieLibrary.checkoutMovie(name);
        if(result) {
            System.out.println("Thank you! Enjoy the movie!");
        } else {
            System.out.println("Sorry, that movie is not available!");
        }
    }

    public void login() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input your library number: ");
        String libraryNumber = sc.next();
        System.out.print("Please input your password: ");
        String password = sc.next();
        Users users = new Users();
        loginUser = users.login(libraryNumber, password);
        if(loginUser == null ) {
            System.out.println("Name or password error!");
        }
    }
    public void viewPersonalInformation() {
        if(loginUser != null) {
            loginUser.printUserInfo();
        } else {
            System.out.println("Please login in first!");
        }

    }

    public void viewCheckoutBooks() {
        if(loginUser != null) {
            library.printCheckoutBooks();
        } else {
            System.out.println("Please login in first!");
        }

    }

    private void returnBookProcess() {
        System.out.print("Please input the book name what you want to return: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        boolean result = library.returnBook(name);
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
        boolean result = library.checkoutBook(name);
        if(result) {
            System.out.println("Thank you! Enjoy the book!");
        } else {
            System.out.println("Sorry, that book is not available!");
        }

    }

    public static void welcome() {
        System.out.println("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
    }
}
