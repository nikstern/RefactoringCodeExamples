import java.util.ArrayList;

/**
 * Created by nickstern on 6/29/17.
 */
public class Customer {

    private String name;
    private ArrayList<Rental> rentals;

    public Customer(String name) {
        this.name = name;
        rentals = new ArrayList<>();
    }

    public void addRental(Rental rental) {
        rentals.add(rental);
    }

    public String getName() {
        return name;
    }

    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        String result = "Rental record for " + getName() + "\n";
        for (Rental rental : rentals) {
            frequentRenterPoints = rental.getFrequentRenterPoints();
            result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rental.getCharge()) + "\n";
            totalAmount += rental.getCharge();
        }
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points";
        return result;
    }

}
