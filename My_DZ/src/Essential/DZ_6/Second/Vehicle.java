package Essential.DZ_6.Second;

public enum Vehicle {
    WRX(35000, "blue"), STI(45000, "silver");
    final int price;
    final String colour;

    // пришлось еще добавить переменную стринг colour в конструктор иначе задача была бы невыполнимой

    Vehicle(int price, String colour) {
        this.price = price;
        this.colour = colour;
    }

    String getColour() {
        return colour;
    }

    public String toString(Vehicle vehicle) {
        return "Chosen vehicle is " + vehicle + ", its price is " + price + " and the colour is " + colour ;
    }
}

class Main{
    public static void main(String[] args) {
        Vehicle vehicle = Vehicle.STI;
        System.out.println(vehicle.toString(vehicle));
    }
}

