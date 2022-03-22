package Essential.DZ_6.First;

public enum Animals {
    BEAR(25), TIGER(15), DEER(10);
    final int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Chosen animal is " + this.name() +  " and his age is " + age;
    }
}

class Main {
    public static void main(String[] args) {
        Animals animal = Animals.DEER;
        System.out.println(animal);
    }
}
