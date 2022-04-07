package Essential.DZ_14.First;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10));
        }
        System.out.println(list);
        list = list.stream().map(number -> Math.toIntExact(Math.round(Math.pow(number, 2)))).collect(Collectors.toList());
        Integer some1 = list.stream().reduce(0,(some, element) -> some + element);
        System.out.println(some1);

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

