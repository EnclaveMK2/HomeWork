package Essential.DZ_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class SimpleHashtable {
    private String key;
    private String value;
    ArrayList<SimpleHashtable> list = new ArrayList<>();

    SimpleHashtable() {
    }

    SimpleHashtable(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public void put(String key, String value) {
        this.list.add(new SimpleHashtable(key, value));
    }

    public String getValue(String key) {
        String neededValue = "";
        for (SimpleHashtable element : list) {
            if ((element.key.equalsIgnoreCase(key))) {
                neededValue = element.value;
                break;
            }
        }
        return neededValue;
    }

    public void changeValue(String key, String value){
        for (SimpleHashtable element : list) {
            if ((element.key.equalsIgnoreCase(key))) {
                element.value = value;
                break;
            }
        }
    }

    public void remove(String key){
        for (SimpleHashtable element : list) {
            if ((element.key.equalsIgnoreCase(key))) {
                list.remove(element);
                break;
            }
        }
    }
}

class Main {
    public static void main(String[] args) throws IOException {
        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put("Порту", "Ивановы");
        hashtable.put("Киев", "Петровы");
        hashtable.put("Лондон", "Васильковы");

        hashtable.changeValue("Лондон", "Париж");

        hashtable.remove("Лондон");
        System.out.println("Please enter the city");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String city = reader.readLine();

        System.out.println(hashtable.getValue(city));
    }
}


