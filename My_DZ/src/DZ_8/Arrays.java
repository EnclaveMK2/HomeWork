package DZ_8;

public class Arrays {
    public static void main(String[] args) {
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }

        reverse(array);
    }

    static void reverse(int[] array) {
        int[] tempArray = new int[array.length];
        int tempPosition = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[tempPosition];
            tempPosition--;
        }
        System.out.println("");
    }
}
