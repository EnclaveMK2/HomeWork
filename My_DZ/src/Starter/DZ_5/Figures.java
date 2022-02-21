package Starter.DZ_5;

public class Figures {
    public static void main(String[] args) {

        {
            int width = 10;
            int height = 5;

            for (int heightCounter = 0; heightCounter < height; heightCounter++) {
                for (int widthCounter = 0; widthCounter < width; widthCounter++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        {
            int height = 7;

            for (int heightCounter = 0; heightCounter < height; heightCounter++) {
                for (int widthCounter = 0; widthCounter <= heightCounter; widthCounter++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        {
            int height = 6;
            int max_spaces = 5;
            int startStars = 1;
            for (int heightCounter = 0; heightCounter < height; heightCounter++) {
                spaceMethod(max_spaces);
                starsMethod(startStars);
                spaceMethod(max_spaces);
                System.out.println();
                max_spaces -= 1;
                startStars += 2;

            }
        }
        {
            int height = 6;
            int max_spaces = 5;
            int startStars = 1;
            for (int heightCounter = 0; heightCounter < height; heightCounter++) {
                spaceMethod(max_spaces);
                starsMethod(startStars);
                spaceMethod(max_spaces);
                System.out.println();
                if (startStars == 11) {
                    break;
                }
                max_spaces -= 1;
                startStars += 2;

            }
            max_spaces += 1;
            startStars -= 2;
            for (int heightCounter = 0; heightCounter < height - 1; heightCounter++) {
                spaceMethod(max_spaces);
                starsMethod(startStars);
                spaceMethod(max_spaces);
                System.out.println();
                max_spaces += 1;
                startStars -= 2;
            }
        }
    }

    static void spaceMethod(int max_spaces) {
        for (int spacesCounter = 0; spacesCounter < max_spaces; spacesCounter++) {
            System.out.print(" ");
        }
    }

    static void starsMethod(int startStars) {
        for (int maxStarsCounter = 0; maxStarsCounter < startStars; maxStarsCounter++) {
            System.out.print("*");
        }
    }
}
