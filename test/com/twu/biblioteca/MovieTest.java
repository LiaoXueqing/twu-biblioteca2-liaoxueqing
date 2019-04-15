package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MovieTest {

        final private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

        final private PrintStream systemOut = System.out;

        @Before
        public void setUp() throws Exception {
            System.setOut(new PrintStream(outContent));
        }


        @Test
        public void printMovieInfo() {
            Movie movie = new Movie("Spring","1992",false);
            movie.printMovieInfo();
            assertThat(outContent.toString(), is("Name: Spring, Year: 1992\n"));
        }

        @After
        public void tearDown() throws Exception {
            System.setOut(systemOut);
        }
}
