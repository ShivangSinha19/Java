import java.util.*;
public class arrayD1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Reversed Array: " + Arrays.toString(reverseArray(arr)));
    }

    public static int[] reverseArray(int[] array) {
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }
}
