package Essential.DZ_6.First;

public enum Animals {
    BEAR(25), TIGER(15), DEER(10);
    final int age;

    Animals(int age) {
        this.age = age;
    }
//пришлось передавать обьект чтобы вытащить имя
    public String toString(Animals animal) {
        return "Chosen animal is " + animal + " and his age is " + age;
    }
}

class Main {
    public static void main(String[] args) {
        Animals animal = Animals.DEER;
        // пришлось обьект закидывать в в тустринг ради имени
        System.out.println(animal.toString(animal));
    }
}
