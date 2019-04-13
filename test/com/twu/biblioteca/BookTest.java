package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BookTest {

    final private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    final private PrintStream systemOut = System.out;

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void showBook() {
        Book book = new Book("english", "qixiaoqi","1972",false);
        book.showBook();
        assertThat(outContent.toString(), is("Name:english Author: qixiaoqi Year:1972\n"));

    }

    @After
    public void tearDown() throws Exception {
        System.setOut(systemOut);
    }
}