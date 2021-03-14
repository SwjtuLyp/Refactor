package main;

import main.enums.MovieType;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.addRental(new Rental(new Movie("hahah", MovieType.CHILDREN), 100));
        System.out.println(customer.statement());
    }
}
