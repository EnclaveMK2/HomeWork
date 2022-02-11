package DZ_6;

import java.util.Scanner;

public class Arithmetics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter operation sign: +, -, *, /");
        String command = input.next();

        switch (command) {
            case "+":
                System.out.println("Please, enter first number for sum:");
                int firstNumber = input.nextInt();
                System.out.println("Please, enter second number for sum:");
                int secondNumber = input.nextInt();
                add(firstNumber, secondNumber);
                break;
            case "-":
                System.out.println("Please, enter first number for subtraction:");
                firstNumber = input.nextInt();
                System.out.println("Please, enter second number for subtraction:");
                secondNumber = input.nextInt();
                sub(firstNumber, secondNumber);
                break;
            case "*":
                System.out.println("Please, enter first number for multiplication:");
                firstNumber = input.nextInt();
                System.out.println("Please, enter second number for multiplication:");
                secondNumber = input.nextInt();
                mul(firstNumber, secondNumber);
                break;
            case "/":
                System.out.println("Please, enter first number for dividing:");
                firstNumber = input.nextInt();
                System.out.println("Please, enter second number for dividing:");
                secondNumber = input.nextInt();
                div(firstNumber, secondNumber);
                break;
        }
    }

    static void add(int firstNumber, int secondNumber) {
        System.out.println("Sum of these two numbers will be " + (firstNumber + secondNumber));
    }

    static void sub(int firstNumber, int secondNumber) {
        System.out.println("Subtract of these two numbers will be " + (firstNumber - secondNumber));
    }

    static void mul(int firstNumber, int secondNumber) {
        System.out.println("Multiply of these two numbers will be " + (firstNumber * secondNumber));
    }

    static void div(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            System.out.println("Zero number is prohibited");
        } else {
            if (firstNumber % secondNumber == 0) {
                System.out.println("Divide of these two numbers will be " + (firstNumber / secondNumber));
            } else {
                System.out.println("Divide of these two numbers will be " + ((float) firstNumber / secondNumber));
            }
        }
    }
}
