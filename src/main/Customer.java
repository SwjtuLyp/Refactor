package main;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {

    private String _name;

    private Vector _rentals = new Vector();

    public String getName() {
        return _name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();
        String result = "main.Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {

            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();
            switch (each.getMovie().getPrinceCode()) {
                case Movie.REGULAR:
                    thisAmount += 2;
                    if (each.getDayRented() > 2) {
                        thisAmount += (each.getDayRented() -2) * 1.5;
                    }
                    break;

                case Movie.NEW_RELEASE:
                    thisAmount += (each.getDayRented()) * 3;
                    break;

                case Movie.CHILDRENS:
                    thisAmount += 1.5;
                    if (each.getDayRented() > 3)
                        thisAmount += (each.getDayRented() - 3) * 1.5;
                    break;

            }

            frequentRenterPoints ++;
            if ((each.getMovie().getPrinceCode() == Movie.NEW_RELEASE) && each.getDayRented() > 1)
                frequentRenterPoints ++;
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }

        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) +
                " frequent renter points";
        return result;
    }
}