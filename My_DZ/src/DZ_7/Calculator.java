package DZ_7;

public class Calculator {
    static int divider = 5;

    public static void main(String[] args) {
        System.out.println(calculate(5, 10, 25));
    }

    static String calculate(int one, int two, int three) {
       return checkParityAndCalculate(one) + " " + checkParityAndCalculate(two)+ " " + checkParityAndCalculate(three);
    }

    static String checkParityAndCalculate(int number) {
        if (number % divider == 0) {
            return String.valueOf(number / divider);
        } else {
            return String.valueOf((double) number / divider);
        }
    }
}
