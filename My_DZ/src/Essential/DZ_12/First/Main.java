package Essential.DZ_12.First;

import java.util.ArrayList;
import java.util.TreeMap;

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
        String [] list = text.split("\\.");
        TreeMap<Integer, String> map = new TreeMap<>();
        for (int i = 0; i < list.length; i++) {
            map.put(list[i].split(" ").length, list[i]);
        }
        ArrayList <String> sortedArray = new ArrayList<>();
        sortedArray.addAll(map.values());
        for (String string: sortedArray) {
            System.out.println(string.trim());
        }
    }
}
