package DZ_6;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter currency, for example Dollars, Euros or Canadians");
        String currency = input.next().toLowerCase();

        float multiplier;
        switch (currency) {
            case "dollars":
                multiplier = 0.036f;
                break;
            case "euros":
                multiplier = 0.031f;
                break;
            case "canadians":
                multiplier = 0.045f;
                break;
            default:
                multiplier = 0;
        }

        if (multiplier != 0) {
            System.out.println("Please, enter amount of hryvnias you want to exchange");
            int hryvnias = input.nextInt();

            System.out.println("You will have " + exchange(hryvnias, multiplier) + " of " + currency);
        } else {
            System.out.println("This type of currency is not allowed");
        }
    }

    static float exchange(int hryvnias, float multiplier) {
        return hryvnias * multiplier;
    }

}
