package DZ_4;

public class LogicOperations {
    public static void main(String[] args) {
        {
            int x = 5, y = 10, z = 15;
            System.out.println(x += y >> x++ * z);
        }
        {
            int x = 5, y = 10, z = 15;
            System.out.println(z = ++x & y * 5);
        }
        {
            int x = 5, y = 10, z = 15;
            System.out.println(y /= x + 5 | z);
        }
        {
            int x = 5, y = 10, z = 15;
            System.out.println(z = x++ & y * 5);
        }
        {
            int x = 5, y = 10, z = 15;
            System.out.println(x = y << x++ ^ z);
        }
    }
}
