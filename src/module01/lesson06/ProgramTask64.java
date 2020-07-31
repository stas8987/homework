package module01.lesson06;

import java.util.Arrays;

public class ProgramTask64 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        swap(array, 1, 2);
        swap(array, 1, 3);
        swap(array, -1, 0);

        int[] array2 = new int[]{2, 4, 6, 8, 10};
        swap(array2, 2, 3);
        swap(array2, 4, 5);
        swap(array2, -2, 0);
    }
    private static void swap(int[] array, int indx_A, int indx_B){
      System.out.println("Trying swap: " + Arrays.toString(array) + " indices " + indx_A + " and " + indx_B);
        if (indx_A > (array.length-1) || indx_A < 0){
            System.out.println("Indx_A (" + indx_A +")" + "incorrect! \n");
        }
        else {
            if (indx_B > (array.length-1) || indx_B < 0){
                System.out.println("Indx_B (" + indx_B +")" + "incorrect! \n");
            }
            else {
                int a = array[indx_A];
                array[indx_A] = array[indx_B];
                array[indx_B] = a;
                System.out.println("Result: " + Arrays.toString(array) + "\n");
            }
        }
    }
}
