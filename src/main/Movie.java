package main;

import main.enums.MovieType;
import main.state.price.ChildrenPrice;
import main.state.price.NewReleasePrice;
import main.state.price.Price;
import main.state.price.RegularPrice;

public class Movie {

    private String _title;

    private MovieType _movieType;

    private Price _price;

    public Movie(String _title, MovieType movieType) {
        this._title = _title;
        this._movieType = movieType;
        setPrice(movieType);
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

    public void set_movieType(MovieType _movieType) {
        this._movieType = _movieType;
        setPrice(_movieType);
    }

    public Price getPrice() {
        return _price;
    }

    public double getCharge(int daysRented) {
        return getPrice().getCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return getPrice().getFrequentRenterPoints(daysRented);
    }

    private void setPrice(MovieType movieType) {
        switch (movieType) {
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            case CHILDREN:
                _price = new ChildrenPrice();
                break;
            case REGULAR:
                _price = new RegularPrice();
                break;
        }
    }
}
