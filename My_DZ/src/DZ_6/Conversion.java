package DZ_6;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter amount of hryvnias you want to exchange to dollars");
        float amount = input.nextFloat();
        System.out.println("Please, enter exchange rate");
        float exchangeRate = input.nextFloat();

        System.out.println("You will have " + amount * exchangeRate + " of dollars");
    }
}
