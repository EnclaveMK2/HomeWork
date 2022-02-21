package Starter.DZ_4;

public class Premium {
    public static void main(String[] args) {
        int visluga = 50;
        int zp = 7000;
        int premiumPercent = 0;
        int totalAmount;

        if (visluga < 5) {
            premiumPercent = 10;
        }
        if (5 <= visluga && visluga < 10) {
            premiumPercent = 15;
        }
        if (10 <= visluga && visluga < 15) {
            premiumPercent = 25;
        }
        if (15 <= visluga && visluga < 20) {
            premiumPercent = 35;
        }
        if (20 <= visluga && visluga < 25) {
            premiumPercent = 45;
        }
        if (25 <= visluga) {
            premiumPercent = 50;
        }
        totalAmount = zp + (zp / 100) * premiumPercent;
        System.out.println("Total amount of money is " + totalAmount);

    }
}
