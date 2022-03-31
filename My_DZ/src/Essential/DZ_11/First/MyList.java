package Essential.DZ_11.First;

import java.util.ArrayList;

public class MyList<T> {
    ArrayList<T> list = new ArrayList<>();

    public T getElementByIndex(int position) {
        return this.list.get(position);
    }

    public boolean addElement(T element) {
        return this.list.add(element);
    }

    public Integer getSize() {
        return this.list.size();
    }
}

class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyList();
        list.addElement("Some");
        list.addElement("Some1");
        list.addElement("Some2");
        list.getElementByIndex(2);
        list.getSize();
    }
}
