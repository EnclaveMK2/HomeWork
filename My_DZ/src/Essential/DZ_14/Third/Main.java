package Essential.DZ_14.Third;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer first = 150;
        Integer second = 75;
        List<Integer> integers = Arrays.asList(150, 75);
        Integer sum = integers.stream()
                .reduce(0, (a, b) -> a + b);/*проблемы с минусом*/
        System.out.println("The sum is : " + sum);

        Arithmetic subtraction = (Integer a, Integer b) -> (a - b);
        System.out.println("Subtraction = " + subtraction.operation(first, second));

        Arithmetic multi = (Integer a, Integer b) -> (a * b);
        System.out.println("Multiply = " + multi.operation(first, second));

        Arithmetic div = (Integer a, Integer b) -> (a / b);
        System.out.println("Divide = " + div.operation(first, second)); /*проблемі с делением меньшего на большее*/
    }
}

interface Arithmetic {
    Integer operation(Integer a, Integer b);
}

