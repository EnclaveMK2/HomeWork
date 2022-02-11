package DZ_7;

import java.util.Scanner;

public class Bank {
    static int creditBody = 3000;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter amount of money you want to pay for credit: ");
        int moneyPaid = input.nextInt();

        paymentMechanic(moneyPaid);
    }

    static void paymentMechanic(int moneyPaid) {
        if (moneyPaid < 100){
            System.out.println("This amount of money is not enough for this operation.");
        }
        creditBody = creditBody - moneyPaid;
        if (creditBody <= 0) {
            System.out.println("Your credit is repaid");
        } else {
            System.out.println("You still need to pay your credit with sum of: " + creditBody + "$");
        }
        if (creditBody < 0) {
            System.out.println("But Bank ows you this amount of money: " + String.valueOf(creditBody).replace("-", "") + "$");
        }
    }
}
