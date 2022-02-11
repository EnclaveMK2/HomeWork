package DZ_7;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(calculate(5, 10, 25));
    }

    static String calculate(int one, int two, int three) {
        return " " + one / 5 + " " + two / 5 + " " + three / 5;
    }
}
