package Essential.DZ_14.Third;

import java.util.ArrayList;
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

        List<Integer> listInt = new ArrayList<>();
        listInt.add(5);
        listInt.add(4);
        listInt.add(3);
        listInt.add(1);
        listInt.add(2);

        int result = listInt.stream().reduce((accumulator, element) -> accumulator + element).get();
//        1. преобразование в стрим 5 4 3 1 2
//        2. аккумулятор = 5 (первый элемент стрима); 4. Аккум = 5 + 4 =9
//        3. элемент = 4; 5. элем = 3
        System.out.println();
    }
}

interface Arithmetic {
    Integer operation(Integer a, Integer b);
}

