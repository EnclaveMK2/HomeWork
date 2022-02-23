package Essential.DZ_5.Third;

import java.util.Scanner;

public class Calculator {
    private static String result;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter desirable function (+, -, * or /)");
        String function = input.next();
        System.out.println("Please, enter first argument");
        int firstArgument = input.nextInt();
        System.out.println("Please, enter second argument");
        int secondArgument = input.nextInt();

        Functions functions = new Functions(function, firstArgument, secondArgument);

        switch (function) {
            case ("*"):
                result = String.valueOf(functions.mul());
                break;
            case ("/"):
                if (secondArgument == 0) {
                    System.out.println("This operation is not allowed.");
                    break;
                }
                if (firstArgument % secondArgument == 0) {
                    result = String.valueOf((int) functions.div());
                } else {
                    result = String.valueOf(functions.div());
                }
                break;
            case ("+"):
                result = String.valueOf(functions.sum());
                break;
            case ("-"):
                result = String.valueOf(functions.sub());
                break;
        }
        System.out.println("The result is " + result);
    }

    static class Functions {
        String function;
        int firstArgument;
        int secondArgument;

        Functions(String function, int firstArgument, int secondArgument) {
            this.function = function;
            this.firstArgument = firstArgument;
            this.secondArgument = secondArgument;
        }

        int sum() {
            return firstArgument + secondArgument;
        }

        int sub() {
            return firstArgument - secondArgument;
        }

        int mul() {
            return firstArgument * secondArgument;
        }

        float div() {
            return (float) firstArgument / secondArgument;
        }
    }
}




