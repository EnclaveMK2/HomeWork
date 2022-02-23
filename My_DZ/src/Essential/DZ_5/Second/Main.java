package Essential.DZ_5.Second;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 'KMH' for kmh -> mils or 'MILS' for mils -> kmh");
        String measure = input.next().toLowerCase();
        System.out.println("Please enter distance that needs to be converted");
        double distanceToConvert  = input.nextDouble();
        Distance distance = new Distance(measure, distanceToConvert);
        distance.print();
    }
}
