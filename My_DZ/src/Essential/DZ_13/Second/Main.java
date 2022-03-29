package Essential.DZ_13.Second;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Price> storeList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            storeList.add(new Price());
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (Price store : storeList) {
            System.out.println("Please, enter the name of a store");
            store.store = reader.readLine();
            System.out.println("Please, enter a kind of goods");
            store.name = reader.readLine();
            System.out.println("Please, enter the price of the goods");
            store.price = reader.readLine();
        }
        Collections.sort(storeList, Comparator.comparing(Price::getStore));

        System.out.println("Please, enter a wanted store`s name");
        String choice = reader.readLine();
        Boolean flag = false;
        for (Price store : storeList) {
            if (store.store.equals(choice)) {
                flag = true;
                System.out.println(store);
                break;
            }
        }
        if (!flag) {
            throw new Exception("The store is incorrect");
        }
    }
}
