package main;

import main.enums.MovieType;

public class Rental {

    private Movie _movie;

    private int _dayRented;

    public Rental(Movie _movie, int _dayRented) {
        this._movie = _movie;
        this._dayRented = _dayRented;
    }

    public Movie getMovie() {
        return _movie;
    }

    public int getDayRented() {
        return _dayRented;
    }

    public double chargeFor() {
        double result = 0;
        switch (this.getMovie().getMovieType()) {
            case REGULAR:
                result += 2;
                if (this.getDayRented() > 2) {
                    result += (this.getDayRented() -2) * 1.5;
                }
                break;

            case NEW_RELEASE:
                result += (this.getDayRented()) * 3;
                break;

            case CHILDREN:
                result += 1.5;
                if (this.getDayRented() > 3)
                    result += (this.getDayRented() - 3) * 1.5;
                break;
        }
        return result;
    }
}
