package Essential.DZ_6.Second;

public enum Vehicle {
    WRX(35000),
    STI(45000);

    final int price;
    final String colour = "blue";

    Vehicle(int price) {
        this.price = price;
    }

    String getColour() {
        return this.colour;
    }

    public String toString() {
        return "Chosen vehicle is " + this.name()
                + ", its price is " + this.price
                + " and the colour is " +  getColour();
    }
}

class Main{
    public static void main(String[] args) {
        Vehicle vehicle = Vehicle.WRX;
        System.out.println(vehicle);
    }
}

