/**
 * Created by nickstern on 6/29/17.
 */
public class Client {
    public static void main (String[] args) {
        Movie theMatrix = new Movie("The Matrix", Movie.REGULAR);
        Movie titanic = new Movie("Titanic", Movie.REGULAR);
        Movie cars = new Movie("Cars", Movie.CHILDRENS);
        Movie up = new Movie("Up", Movie.CHILDRENS);
        Movie wonderWoman = new Movie("Wonder Woman", Movie.NEW_RELEASE);
        Movie spiderMan = new Movie("Spider-Man: Homecoming", Movie.NEW_RELEASE);

        Rental rentalMatrix = new Rental(theMatrix, 3);
        Rental rentalTitanic = new Rental(titanic, 1);
        Rental rentalCars = new Rental(cars, 4);
        Rental rentalUp = new Rental(up, 2);
        Rental rentalWonderWoman = new Rental(wonderWoman, 3);
        Rental rentalSpiderMan = new Rental(spiderMan, 1);

        Customer professor = new Customer("Professor Isaacs");
        professor.addRental(rentalMatrix);
        professor.addRental(rentalCars);
        professor.addRental(rentalWonderWoman);
        System.out.println(professor.statement());

        Customer assistant = new Customer("Nick Stern");
        assistant.addRental(rentalTitanic);
        assistant.addRental(rentalUp);
        assistant.addRental(rentalSpiderMan);
        System.out.println(assistant.statement());
    }


}
