package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MovieLibrary {
    private List<Movie> movies;

    public MovieLibrary() {
        movies = new ArrayList<Movie>() {
            {
                add(new Movie("Spring", "1982", true));
                add(new Movie("Duck", "1978", false));
                add(new Movie("Happy New Year", "1957", false));
                add(new Movie("Big Foot", "1982", false));
            }
        };
    }

    public MovieLibrary(List<Movie> movies) {
        this.movies = movies;
    }


    public void showAvailableMovies() {
        List<Movie> libraryMovies = movies.stream().filter(item -> !item.isCheckout()).collect(Collectors.toList());
        for (Movie movie : libraryMovies) {
            movie.printMovieInfo();
        }
    }

    public boolean checkoutMovie(String name) {
        boolean result = false;
        for(Movie movie : movies) {
            if(movie.getName().equals(name) && movie.isCheckout() == false) {
                movie.setCheckout(true);
                result = true;
                break;
            }
        }
        return result;
    }
}
