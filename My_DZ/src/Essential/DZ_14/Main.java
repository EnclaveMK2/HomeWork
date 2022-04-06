package Essential.DZ_14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10));
        }
        System.out.println(list);

//        list.stream().map(number -> String.valueOf(number.toString()))
//                .collect(Collectors.toList());

//        list.stream().forEach(element -> System.out.println(element));
//        list.stream().forEach(System.out::println);
        list.stream().forEach(Some::method);

//        System.out.println();
    }
}

class Some{
   static Integer method(Integer a){
       return a += 2;
    }
}

