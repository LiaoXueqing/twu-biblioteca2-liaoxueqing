package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class UserTest {

    final private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    final private PrintStream systemOut = System.out;

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));
    }


    @Test
    public void printUserInfo() {
        User user = new User("xiaoxiao","pass",11,"movie");
        user.printUserInfo();
        assertThat(outContent.toString(), is("LibraryNumber: xiaoxiao Age: 11 Hobby: movie\n"));

    }

    @After
    public void tearDown() throws Exception {
        System.setOut(systemOut);
    }
}