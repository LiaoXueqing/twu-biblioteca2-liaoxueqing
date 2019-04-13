package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    //view available books
    public void showBooks() {
        List<Book> libraryBooks = books.stream().filter(item -> !item.isCheckout()).collect(Collectors.toList());
        for (Book book : libraryBooks) {
            book.showBook();
        }
    }

    //checkout a book
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

    public boolean returnBook(String name) {
        boolean result = false;
        for(Book book : books) {
            if(book.getName().equals(name) && book.isCheckout() == false) {
                book.showBook();
                result = true;
                break;

            }
        }
        return result;
    }

    public void printCheckoutBooks() {
        List<Book> checkoutBooks = books.stream().filter(item -> item.isCheckout()).collect(Collectors.toList());
        for (Book book : checkoutBooks) {
            book.showBook();
        }
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
