package Essential.DZ_9.Third;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        System.out.println("Please, enter any word");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            int dynamicLoopExtender = 2;
            String line;
            for (int i = 0; i < dynamicLoopExtender; i++) {
                line = reader.readLine();
                if (line.equals("end")) {
                    break;
                }
                list.add(line);
                dynamicLoopExtender++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

