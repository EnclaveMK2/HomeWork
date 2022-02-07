package DZ_3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First value is 7 and the second is 5. Please, enter desirable operation:");
        String sign = scanner.next();
        int operand1 = 7;
        int operand2 = 5;

        switch (sign) {
            case ("*"):
                System.out.println("Result of this operation is: " + (operand1 * operand2));
                break;
            case ("/"):
                if (operand2 == 0) {
                    System.out.println("This operation is not allowed.");
                    break;
                }
                System.out.println("Result of this operation is: " + ((float) operand1 / operand2));
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
