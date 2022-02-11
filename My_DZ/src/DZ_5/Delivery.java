package DZ_5;

public class Delivery {
    public static void main(String[] args) {
        {
            int numberOfClients = 7;
            int numberOfClientsInProcess = 1;
            int result = 1;
            do {
                result *= numberOfClientsInProcess;
                numberOfClientsInProcess++;
            } while (numberOfClientsInProcess <= numberOfClients);
            System.out.println(result);
        }
        {
            int numberOfClients = 7;
            int result = 1;
            do {
                result *= numberOfClients;
                --numberOfClients;
            } while (numberOfClients > 0);
            System.out.println(result);
        }
    }
}
