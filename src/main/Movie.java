package main;

import main.enums.MovieType;

public class Movie {

    private String _title;

    private MovieType _movieType;

    public Movie(String _title, MovieType movieType) {
        this._title = _title;
        this._movieType = movieType;
    }

    public String getTitle() {
        return _title;
    }

    public void setTitle(String _title) {
        this._title = _title;
    }

    public MovieType getMovieType() {
        return _movieType;
    }

    public double getCharge(int daysRented) {
        double result = 0;
        switch (this.getMovieType()) {
            case REGULAR:
                result += 2;
                if (daysRented > 2) {
                    result += (daysRented -2) * 1.5;
                }
                break;

            case NEW_RELEASE:
                result += daysRented * 3;
                break;

            case CHILDREN:
                result += 1.5;
                if (daysRented > 3)
                    result += (daysRented - 3) * 1.5;
                break;
        }
        return result;
    }

    public int getFrequentRenterPoints(int daysRented) {
        if (_movieType.equals(MovieType.NEW_RELEASE)
                && daysRented > 1) {
            return 2;
        }
        return 1;
    }
}
