package DZ_8;

public class UserArray {
    public static void main(String[] args) {
        int[] array = new int[5];
        array[0] = 5;
        array[1] = 6;
        array[2] = 3;
        array[3] = 8;
        array[4] = 1;
    }

    static void modifyPlusOne(int[] array){
        int[] tempArray = new int[array.length+1];
        for (int i = 0; i < array.length; i++) {
            tempArray[i] = array[i];
        }
    }
}