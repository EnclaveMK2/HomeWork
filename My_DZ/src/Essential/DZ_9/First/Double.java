package Essential.DZ_9.First;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Double {
    public static void main(String[] args) throws IOException {
        List<String> list = new ArrayList<>();

        System.out.println("Please, enter 5 word");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            try {
                String line = reader.readLine();
                list.add(line);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        reader.close();

        for (int i = 0; i < list.size(); i++) {
            list.set(i, doubleValue(list.get(i)));
        }
        for (String word : list){
            System.out.println(word);
        }
    }

    static String doubleValue(String word) {
        String doubledWord = "";
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < 2; j++) {
                char letter = word.charAt(i);
                doubledWord = doubledWord + letter;
            }
        }
        return doubledWord;

    }
}
