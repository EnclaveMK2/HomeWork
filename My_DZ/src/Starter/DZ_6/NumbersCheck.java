package Starter.DZ_6;

import java.util.Scanner;

public class NumbersCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter some number for checking:");
        int enteredNumber = input.nextInt();

        checkPlusOrMinus(enteredNumber);

        if (checkSimpleNumber(enteredNumber)) {
            System.out.println("This number meets our criteria");
        } else {
            System.out.println("This number does not meet our criteria");
        }


    }



    static void checkPlusOrMinus(int enteredNumber) {
        if (enteredNumber < 0) {
            System.out.println("This number is negative");
        } else {
            System.out.println("This number is positive");
        }
    }

    static boolean checkSimpleNumber(int enteredNumber) {
        boolean flag = true;
        for (int counter = 2; counter < enteredNumber; counter++) {
            if (enteredNumber % counter == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    static void dividingWithout(int enteredNumber) {
        boolean flag = true;
        for (int counter = 2; counter < enteredNumber; counter++) {
            if (enteredNumber % counter == 0) {
                System.out.println("This number does not meet our criteria");
                break;
            } else {
                System.out.println("This number meets our criteria");
            }
        }
    }
}
