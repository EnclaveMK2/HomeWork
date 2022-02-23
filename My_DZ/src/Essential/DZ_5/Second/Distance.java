package Essential.DZ_5.Second;

public class Distance {
    double distance;

    Distance(String measure, double distanceToConvert) {
        switch (measure) {
            case "kmh":
                distance = Converter.kmToMil(distanceToConvert);
                break;
            case "mil":
                distance = Converter.milToKmh(distanceToConvert);
        }
    }

    void print() {
        System.out.println("The distance will be: " + distance);
    }

    static class Converter {

        static double kmToMil(double kmh) {
            return kmh * 0.62;
        }

        static double milToKmh(double mil) {
            return mil / 0.62;
        }
    }
}

