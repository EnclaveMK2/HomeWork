package Essential_1.First;

import java.util.Scanner;

public class Rectangle {
    private double side1;
    private double side2;

    static double areaCalculator(double side1, double side2) {
        return (side1 * side2) / 2;
    }

    static double perimeterCalculator(double side1, double side2) {
        double hypotenuse = Math.sqrt((Math.pow(side1, 2)) + (Math.pow(side2, 2)));
        return hypotenuse + side1 + side2;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the length of the first side of the triangle: ");
        rectangle.side1 = input.nextDouble();
        System.out.println("Please, enter the length of the second side of the triangle: ");
        rectangle.side2 = input.nextDouble();

        System.out.println("The area of the triangle is: " + areaCalculator(rectangle.side1, rectangle.side2));

        System.out.println("The perimeter of the triangle is: " + perimeterCalculator(rectangle.side1, rectangle.side2));
    }
}
