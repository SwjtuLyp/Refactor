package main;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.addRental(new Rental(new Movie("hahah", 1), 100));
        System.out.println(customer.statement());
    }
}
