import java.util.Scanner;

public class MadLib {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String firstName;
        String genericLocation;
        int wholeNumber;
        String pluralNoun;

        firstName = scnr.next(); //stores a string up to the first space
        genericLocation = scnr.next();
        wholeNumber = scnr.nextInt();
        pluralNoun = scnr.next();

        System.out.println(firstName + " went to " + genericLocation + " to buy " + wholeNumber + " different types of " + pluralNoun + ".");
    }
}

