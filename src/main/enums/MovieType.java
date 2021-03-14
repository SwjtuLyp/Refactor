package main.enums;

public enum MovieType {

    CHILDREN(2),
    REGULAR(0),
    NEW_RELEASE(1);

    int priceCode;

    MovieType(int priceCode) {
        this.priceCode = priceCode;
    }

}
