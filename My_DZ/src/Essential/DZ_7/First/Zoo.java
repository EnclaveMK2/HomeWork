package Essential.DZ_7.First;

import java.util.ArrayList;

public class Zoo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        for (int counter = 0; counter < 8; counter++) {
            list.add("Animal " + counter);
        }
        System.out.println(list);
    }
}
