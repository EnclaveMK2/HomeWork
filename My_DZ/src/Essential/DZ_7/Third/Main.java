package Essential.DZ_7.Third;

import java.util.ArrayList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int counter = 0; counter < 5; counter++) {
            list.add(counter);
        }

        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()) {
            int value = (int) iterator.next();
            System.out.println();
            iterator.set(value + 1);
        }
        System.out.println(list);
    }
}
