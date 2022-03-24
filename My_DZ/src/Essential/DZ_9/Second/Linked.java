package Essential.DZ_9.Second;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Linked {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list = getIntegerList(list);
        System.out.println("Minimal digit is " + getMinimum(list));
    }

    static LinkedList<Integer> getIntegerList(LinkedList<Integer> list){
        System.out.println("Please, enter 5 digits");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            try {
                String line = reader.readLine();
                list.add(Integer.valueOf(line));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    static Integer getMinimum(LinkedList<Integer> list){
        Integer minimumDigit = null;
        for (Integer digit : list) {
            if (minimumDigit == null){
                minimumDigit = digit;
            }
            if (digit < minimumDigit){
                minimumDigit = digit;
            }
        }
        return minimumDigit;
    }
}
