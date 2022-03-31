package Essential.DZ_11.Second;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MyDictionary<TKey, TValue> {
    HashMap<TKey, TValue> map = new HashMap<>();

    public TValue putElement(TKey key, TValue value) {
        return this.map.put(key, value);
    }

    public TValue getValue(TKey key) {
        return this.map.get(key);
    }

    public Set<Map.Entry<TKey, TValue>> showContent() {
        return this.map.entrySet();
    }
}

class Main {
    public static void main(String[] args) {
        MyDictionary<Integer, String> myDictionary = new MyDictionary<>();
        myDictionary.putElement(1, "show");
        myDictionary.putElement(2, "show3");
        myDictionary.putElement(3, "show4");
        myDictionary.getValue(2);
        myDictionary.showContent();
    }
}
