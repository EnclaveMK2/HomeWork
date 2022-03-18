package Essential.DZ_7.Second;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int counter = 0; counter < 8; counter++) {
            list.add("Animal " + counter);
        }
        System.out.println(list);

        list.remove("Animal 3");
        list.remove("Animal 5");
        list.remove("Animal 7");

        System.out.println(list.size());
    }
}
