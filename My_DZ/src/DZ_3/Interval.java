package DZ_3;

import java.util.Scanner;

public class Interval {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 0 and 100: ");
        String number = scanner.next();
        if (Integer.valueOf(number) <= 14 && Integer.valueOf(number) > 0) {
            System.out.println("This value is between 0 and 14");
        }
        if (Integer.valueOf(number) >= 15 && Integer.valueOf(number) <= 35) {
            System.out.println("This value is between 15 and 35");
        }
        if (Integer.valueOf(number) >= 36 && Integer.valueOf(number) <= 50) {
            System.out.println("This value is between 36 and 50");
        }
        if (Integer.valueOf(number) >= 50 && Integer.valueOf(number) <= 100) {
            System.out.println("This value is between 50 and 100");
        }
    }
}
