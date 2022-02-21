package Essential.Essential_3.Second;

public class Plane extends Vehicle {
    private int passengers = 200;
    private int height = 5700;

    Plane() {
        speed = 850;
        price = 25000000;
        year = 2017;
        coordinates = "In the airport";

        speed();
        price();
        year();
        coordinates();
        passengers();
        height();
    }

    void passengers() {
        System.out.println("Amount of passengers on board is :" + passengers);
    }

    void height() {
        System.out.println("The height of this plane is :" + height + "km");
    }


}
