package Essential.DZ_3.Second;

public class Vehicle {
    int price;
    int speed;
    int year;
    String coordinates;

    void speed() {
        System.out.println("The speed of this vehicle is " + speed + " km/h");
    }

    void price() {
        System.out.println("The price of this vehicle is " + price + "$");
    }

    void year() {
        System.out.println("The year of production of this vehicle is " + year);
    }

    void coordinates() {
        System.out.println("The coordinates of this vehicle are :" + coordinates);
    }

    public static void main(String[] args) {
        System.out.println("Information about the car:");
        Car car = new Car();
        System.out.println("\n");
        System.out.println("Information about the ship:");
        Ship ship = new Ship();
        System.out.println("\n");
        System.out.println("Information about the plane:");
        Plane plane = new Plane();
    }
}
