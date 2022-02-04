public class Dz_2 {

    public static void main(String[] args) {

        {
            int x = 10, y = 12, z = 3;
            x += y - x++ * z;
            System.out.println(x);
        }

        {
            int x = 10, y = 12, z = 3;
            z = --x - y * 5;
            System.out.println(z);
        }

        {
            int x = 10, y = 12, z = 3;
            y /= x + 5 % z;
            System.out.println(y);
        }

        {
            int x = 10, y = 12, z = 3;
            z = x++ + y * 5;
            System.out.println(z);

//            не понимаю, у меня выходит тут 71, а Джава выдает 70.
        }

        {
            int x = 10, y = 12, z = 3;
            x = y - x++ * z;
            System.out.println(x);
        }
    }
}
