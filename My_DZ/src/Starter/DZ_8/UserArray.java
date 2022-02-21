package Starter.DZ_8;

public class UserArray {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 5;
        array[1] = 6;
        array[2] = 3;
        array[3] = 8;
        array[4] = 1;

        modifyPlusOne(array);

        modifyZeroPosition(array, 5);
    }

    static void modifyPlusOne(int[] array){
        int[] tempArray = new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i];
        }
    }

    static void modifyZeroPosition(int[] array, int value){
        int[] tempArray = new int[array.length+1];
        tempArray[0] = value;
        for (int i = 0; i < array.length; i++) {
            tempArray[i+1] = array[i];
        }
        System.out.println("");
    }
}
