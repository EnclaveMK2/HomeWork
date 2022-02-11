package DZ_3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operand1 = 7;
        int operand2 = 5;
        System.out.println("First value is " + operand1 + " and the second is " + operand2 + ". Please, enter desirable operation:");
        String sign = scanner.next();


        switch (sign) {
            case ("*"):
                System.out.println("Result of this operation is: " + (operand1 * operand2));
                break;
            case ("/"):
                if (operand2 == 0) {
                    System.out.println("This operation is not allowed.");
                    break;
                }
                if (operand1 % operand2 == 0) {
                    System.out.println("Result of this operation is: " + (operand1 / operand2));
                } else {
                    System.out.println("Result of this operation is: " + ((float) operand1 / operand2));
                }
                break;
            case ("+"):
                System.out.println("Result of this operation is: " + (operand1 + operand2));
                break;
            case ("-"):
                System.out.println("Result of this operation is: " + (operand1 - operand2));
                break;
        }
    }
}
