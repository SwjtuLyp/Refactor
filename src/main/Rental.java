package main;

import main.enums.MovieType;

public class Rental {

    private Movie _movie;

    private int _dayRented;

    private int frequentRenterPoints;

    public Rental(Movie _movie, int _dayRented) {
        this._movie = _movie;
        this._dayRented = _dayRented;
        this.frequentRenterPoints = 1;
    }

    public Rental(Movie _movie, int _dayRented, int frequentRenterPoints) {
        this._movie = _movie;
        this._dayRented = _dayRented;
        this.frequentRenterPoints = frequentRenterPoints;
    }

    public Movie getMovie() {
        return _movie;
    }

    public int getDayRented() {
        return _dayRented;
    }

    public int getFrequentRenterPoints() {
        return _movie.getFrequentRenterPoints(_dayRented);
    }

    public double getCharge() {
        return _movie.getCharge(_dayRented);
    }
}
