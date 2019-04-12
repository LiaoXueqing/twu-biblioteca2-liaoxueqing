package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class BibliotecaAppTest {

    Library library;

    @Before
    public void setUp() throws Exception {
        library = mock(Library.class);
        when(library.getBooks()).thenReturn(new ArrayList<Book>(){
            {
                add(new Book("book1"));
                add(new Book("book2"));
                add(new Book("book3"));
                add(new Book("book4"));
            }
        });
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
    public void booksLength() {
        List<Book> b = library.getBooks();
        assertThat(b.size(), is(4));
    }

}