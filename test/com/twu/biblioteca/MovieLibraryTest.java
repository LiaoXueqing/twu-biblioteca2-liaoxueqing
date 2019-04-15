package com.twu.biblioteca;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class MovieLibraryTest {
    private MovieLibrary library;
    private List<Movie> movies;

    final private ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    final private PrintStream systemOut = System.out;

    @Before
    public void setUp() throws Exception {
        System.setOut(new PrintStream(outContent));

        movies = new ArrayList<Movie>() {
            {
                add(new Movie("Spring", "1982", true));
                add(new Movie("Duck", "1978", false));
                add(new Movie("Happy New Year", "1957", false));
                add(new Movie("Big Foot", "1982", false));
            }
        };
        library = new MovieLibrary(movies);
    }

    @Test
    public void checkoutMovieRight() {
        assertTrue(library.checkoutMovie("Duck"));
    }

    @Test
    public void checkoutBookError() {
        assertFalse(library.checkoutMovie("Spring"));
    }

    @Test
    public void showAvailableMovies() {
        library.showAvailableMovies();
        assertThat(outContent.toString(), is("Name: Duck, Year: 1978\nName: Happy New Year, Year: 1957\nName: Big Foot, Year: 1982\n"));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(systemOut);

    }
}


