package Starter.DZ_3;

import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a russian word: ");
        String word = scanner.next();
        switch (word.toLowerCase()) {
            case ("погода"):
                System.out.println("Translation of this word on English will be: Weather");
                break;
            case ("солнечно"):
                System.out.println("Translation of this word on English will be: Sunny");
                break;
            case ("дождливо"):
                System.out.println("Translation of this word on English will be: Rainy");
                break;
            case ("жарко"):
                System.out.println("Translation of this word on English will be: Hot");
                break;
            case ("холодно"):
                System.out.println("Translation of this word on English will be: Cold");
                break;
            case ("ветренно"):
                System.out.println("Translation of this word on English will be: Windy");
                break;
            case ("снег"):
                System.out.println("Translation of this word on English will be: Snow");
                break;
            case ("туманно"):
                System.out.println("Translation of this word on English will be: Foggy");
                break;
            case ("шторм"):
                System.out.println("Translation of this word on English will be: Storm");
                break;
            case ("ураган"):
                System.out.println("Translation of this word on English will be: Hurricane");
                break;
            default:
                System.out.println("This word is not supported by our translator. We are very sorry, better next time ;)");
                break;
        }
    }
}
