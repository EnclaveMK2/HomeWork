package Essential.DZ_5.Second;

public class Distance {
    static double distance;

    Distance(double distanceToConvert) {
        distance = distanceToConvert;
    }

    void print(double convertedDistance) {
        System.out.println("The distance will be: " + convertedDistance);
    }

    static class Converter {

        static double kmToMil() {
            return distance * 0.62;
        }

        static double milToKmh() {
            return distance / 0.62;
        }
    }
}

