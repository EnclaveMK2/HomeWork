package DZ_5;

public class SumMin {
    public static void main(String[] args) {
        {
            int a = 5;
            int b = 27;
            int result =0;
            do {
                result += a;
                a++;
            } while (a <= b);
            System.out.println("Sum of all numbers between 5 an 27 (included) is : " + result);
        }

        {
            int a = 5;
            int b = 27;
            int result = 0;
            for (; a <= b; ++a) {
                result+= a;
            }
            System.out.println("Sum of all numbers between 5 an 27 (included) is : " + result);
        }
        {
            int a = 5;
            int b = 27;
            for (; a <= b; a++) {
                if (a % 2 != 0) {
                    System.out.println(a);
                }

            }
        }
    }
}
