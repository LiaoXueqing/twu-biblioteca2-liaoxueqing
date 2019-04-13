package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class LibraryTest {
    Library library;
    private List<Book> books;
    final private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    final private PrintStream systemOut = System.out;

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));

        books = new ArrayList<Book>(){
            {
                add(new Book("book1", "sanmao", "1982", true));
                add(new Book("book2", "xiaoyu", "1978", false));
                add(new Book("book3", "jingyong", "1957", false));
                add(new Book("book4", "doudou", "1982", false));
            }
        };
        library = new Library(books);
    }

    @Test
    public void showBooks() {
        library.showBooks();
        assertThat(outContent.toString(), is("Name:book2 Author: xiaoyu Year:1978\nName:book3 Author: jingyong Year:1957\nName:book4 Author: doudou Year:1982\n"));
    }

    @Test
    public void checkoutBookRight() {
        assertTrue(library.checkoutBook("book3"));
    }

    @Test
    public void checkoutBookError() {
        assertFalse(library.checkoutBook("book1"));
    }

    @Test
    public void returnBookRight() {
        assertTrue(library.checkoutBook("book3"));
    }

    @Test
    public void returnBookError() {
        assertFalse(library.checkoutBook("book1"));
    }

    @Test
    public void printCheckoutBooks() {
        library.printCheckoutBooks();
        assertThat(outContent.toString(),is("Name:book1 Author: sanmao Year:1982\n"));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(systemOut);
    }
}