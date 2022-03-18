package Essential.DZ_5.First;

public class Vehicle {

    void print() {
        System.out.println("Something");
    }

    public static void main(String[] args) {
        Wheel wheel = new Wheel();
        Door door = new Door();
        wheel.print();
        door.print();
    }

    static class Wheel {
        void print() {
            System.out.println("Something from the WHEEL");
        }
    }

    static class Door {
        void print() {
            System.out.println("Something from the DOOR");
        }
    }
}

