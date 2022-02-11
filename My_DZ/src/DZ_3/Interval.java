package DZ_3;

import java.util.Scanner;

public class Interval {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 0 and 100: ");
        int number = scanner.nextInt();

        if (number <= 14 && number >= 0) {
            System.out.println("This value is between 0 and 14");
        }
        if (number >= 15 && number <= 35) {
            System.out.println("This value is between 15 and 35");
        }
        if (number >= 36 && number <= 50) {
            System.out.println("This value is between 36 and 50");
        }
        if (number >= 50 && number <= 100) {
            System.out.println("This value is between 50 and 100");
        }
        if (number < 0 || number > 100) {
            System.out.println("This number does not meet our criteria");
        }
    }
}
