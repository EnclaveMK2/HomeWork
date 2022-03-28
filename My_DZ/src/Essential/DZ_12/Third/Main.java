package Essential.DZ_12.Third;

public class Main {
    static String text = "The second-generation WRX (GD/GG " +
            "chassis codes for the sedan/hatchback, " +
            "respectively) was brought over to the United " +
            "States domestic market for model year 2002, " +
            "with the STI being brought over for model year 2004.";

    public static void main(String[] args) {
        String firstPart = text.substring(0, text.length()/2);
        String secondPart = text.substring(text.length()/2);
        System.out.println(firstPart);
        System.out.println(secondPart);
    }
}
