//package Essential.DZ_13.First;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        ArrayList<Worker> workers = new ArrayList<>();
//        for (int i = 0; i < 2; i++) {
//            workers.add(new Worker());
//        }
//
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        for (Worker worker: workers) {
//            System.out.println("Please, enter surname");
//            worker.surname = reader.readLine();
//            System.out.println("Please, enter initials");
//            worker.initials = reader.readLine();
//            System.out.println("Please, enter profession");
//            worker.profession = reader.readLine();
//            try {
//                System.out.println("Please, enter start year");
//                worker.startYear = reader.readLine();
//                if (worker.startYear.length() != 4
//                        || (2022 - worker.startYear) > 25
//                        || worker.startYear - 2022 > 25)) {
//                    throw new Exception();
//                }
//            } catch (Exception e) {
//                System.out.println("Date is incorrect for  " + worker.surname);
//            }
//        }
//        Collections.sort(workers, Comparator.comparing(Worker::getSurname));
//
//        System.out.println(workers);
//    }
//}
