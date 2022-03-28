package Essential.DZ_12.Second;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    static String text = "Each string created with the new operator" +
            " or with a literal (enclosed in double apostrophes) " +
            "is an object of the String class. A feature of an " +
            "object of the String class is that its value cannot " +
            "be changed after the object is created using any " +
            "method of the class, since any change in the string " +
            "leads to the creation of a new object. " +
            "The StringBuilder and StringBuffer classes are \"twins\" and are" +
            " similar in purpose to the String class, but, unlike " +
            "the latter, the contents and sizes of objects of the " +
            "StringBuilder and StringBuffer classes can be changed. " +
            "The main and only difference between StringBuilder and " +
            "StringBuffer is the thread safety of the latter. StringBuffer, " +
            "StringBuilder, and String objects can be converted to " +
            "each other using the appropriate methods and constructors. " +
            "The constructor for the StringBuffer class (just like StringBuilder)" +
            " can take a String object as a parameter.";

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        Collections.addAll(list, (text.split("\\.")));
        for (int i = 0; i < list.size(); i++) {
            ArrayList<String> tempList = new ArrayList<>();
            Collections.addAll(tempList, (list.get(i).trim().split(" ")));
            String first = tempList.get(0);
            String last = tempList.get(tempList.size()-1);
            tempList.set(0, last);
            tempList.set(tempList.size()-1, first);
            System.out.println((String.join(" ", tempList)).concat("."));
        }
    }
}
