package main;

import main.enums.MovieType;

public class Movie {

    private String _title;

    private MovieType movieType;

    public Movie(String _title, MovieType movieType) {
        this._title = _title;
        this.movieType = movieType;
    }

    public String getTitle() {
        return _title;
    }

    public void setTitle(String _title) {
        this._title = _title;
    }

    public MovieType getMovieType() {
        return movieType;
    }
}
