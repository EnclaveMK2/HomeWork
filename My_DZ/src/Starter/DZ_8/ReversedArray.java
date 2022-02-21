package Starter.DZ_8;

public class ReversedArray {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 5;
        array[1] = 6;
        array[2] = 3;
        array[3] = 8;
        array[4] = 1;

        myReverse(array);

        // check index 0
        subArray(array, 0, 20);
    }

    static int[] myReverse(int[] array) {
        int[] tempArray = new int[array.length];
        tempArray[0] = array[4];
        tempArray[1] = array[3];
        tempArray[2] = array[2];
        tempArray[3] = array[1];
        tempArray[4] = array[0];
        return tempArray;
    }

    static int[] subArray(int[] array, int index, int count){
        int[] tempArray = new int[count];
        int tempCounter = 0;
        for (; index < count; index++) {
            if(index < array.length) {
                tempArray[tempCounter] = array[index];
            } else {
                tempArray[tempCounter] = 1;
            }
            tempCounter++;
        }
        return tempArray;
    }
}
