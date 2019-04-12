package com.twu.biblioteca;

import org.hamcrest.Matcher;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class BibliotecaAppTest {

    @Test
    public void welcome() {
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        PrintStream old = System.out;
        System.setOut(new PrintStream(outContent));

        BibliotecaApp.welcome();
        assertThat(outContent.toString(), is("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!\n"));

        System.setOut(old);
    }
}