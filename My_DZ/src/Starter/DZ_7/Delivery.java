package Starter.DZ_7;

public class Delivery {
    public static void main(String[] args) {
        int numberOfClients = 7;

        System.out.println(calculateRoutsRecursion(numberOfClients));

        System.out.println(calculateRoutsFor(numberOfClients));

        System.out.println(calculateRoutsDoWhile(numberOfClients));

        int tempRouts = numberOfClients;
        for (int i = 2; i < numberOfClients; i++) {
            tempRouts = simple(tempRouts, i);
        }
        System.out.println(tempRouts);
    }

    static int calculateRoutsRecursion(int numberOfClients) {
        if (numberOfClients == 0) {
            return 1;
        } else
            return numberOfClients * calculateRoutsRecursion(numberOfClients - 1);
    }

    static int calculateRoutsFor(int numberOfClients) {
        int routs = numberOfClients;
        for (int i = 2; i < numberOfClients; i++) {
            routs *= i;
        }
        return routs;
    }

    static int calculateRoutsDoWhile(int numberOfClients) {
        int numberOfRouts = numberOfClients;
        do {
            numberOfClients = numberOfClients - 1;
            numberOfRouts *= numberOfClients;
        } while (numberOfClients > 1);
        return numberOfRouts;
    }

    static int simple(int routs, int number) {
        return routs * number;
    }
}
