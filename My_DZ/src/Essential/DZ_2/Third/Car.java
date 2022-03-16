package Essential.DZ_2.Third;

public class Car {
    private int year;
    private String colour;
    private int speed;
    private int weight;

    public Car() {
        this(2003, "Bluer", 205, 1350);
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(String colour) {
        this.colour = "Blue";
    }

    public Car(int year, String colour) {
        this.year = year;
        this.colour = colour;
    }

    public Car(int year, String colour, int speed) {
        this.year = year;
        this.colour = colour;
        this.speed = speed;
    }

    public Car(int year, String colour, int speed, int weight) {
        this.year = year;
        this.colour = colour;
        this.speed = speed;
        this.weight = weight;
    }
}
