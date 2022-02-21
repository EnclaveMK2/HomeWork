package Essential.Essential_3.Second;

public class Ship extends Vehicle{
    private int passengers = 750;
    String destination = "Odessa";


    Ship(){
        speed = 90;
        price = 150000000;
        year = 2015;
        coordinates = "In the port";

        speed();
        price();
        year();
        coordinates();
        passengers();
        destination();
    }

    void passengers() {
        System.out.println("Amount of passengers on board is :" + passengers);
    }

    void destination() {
        System.out.println("The destinations of this ship is :" + destination);
    }
}
