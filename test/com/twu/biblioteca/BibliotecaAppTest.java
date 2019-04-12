package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BibliotecaAppTest {
    BibliotecaApp app;
    @Before
    public void setUp() throws Exception {
        app =  new BibliotecaApp();
    }

    @Test
    public void welcome() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        PrintStream old = System.out;
        System.setOut(new PrintStream(outContent));

        BibliotecaApp.welcome();
        assertThat(outContent.toString(), is("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!\n"));

        System.setOut(old);
    }

    @Test
    public void showBooks() {
        List<Book> books = new ArrayList<Book>(){
            {
                add(new Book("book1"));
                add(new Book("book2"));
                add(new Book("book3"));
                add(new Book("book4"));
            }
        };

        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        PrintStream old = System.out;
        System.setOut(new PrintStream(outContent));

        app.showBooks(books);

        assertThat(outContent.toString(), is("book1\nbook2\nbook3\nbook4\n"));

        System.setOut(old);
    }
}