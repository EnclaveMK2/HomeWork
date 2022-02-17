package DZ_8;

import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please, enter desirable size of an array: ");
        int size = input.nextInt();

        int array[] = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        int minValue = array[0];
        int maxValue = array[0];
        int sum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
            if (maxValue < array[i]) {
                maxValue = array[i];
            }
            if (i != 0) {
                sum += array[i];

            }
        }
        System.out.println("Min Value is " + minValue);
        System.out.println("Max Value is " + maxValue);
        System.out.println("Sum is " + sum);

        if (sum % array.length == 0) {
            System.out.println("Middle number is " + sum / array.length);
        } else {
            System.out.println("Middle number is " + (double) sum / array.length);
        }

        for (int j : array) {
            if (j % 2 != 0) {
                System.out.print(j);
            }
        }
    }
}