package Starter.DZ_2;

public class Volume {
    public static void main(String[] args) {
        final double pi = 3.14159265359;
        byte r = 8, h = 10;
        double v, s;
        v = pi * Math.pow(r, 2) * h;
        System.out.println("Volume is " + v);

        s = (2 * pi * Math.pow(r, 2)) + (2 * pi * Math.pow(r, 2));
        System.out.println("Square is " + s);


    }
}
