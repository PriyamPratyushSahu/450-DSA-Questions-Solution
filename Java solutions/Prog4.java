/*
Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo
 */

import java.util.Arrays;
public class Prog4 {
    public static void sortArray(int[] arr) {
        int low = 0; // pointer for 0
        int mid = 0; // pointer for 1
        int high = arr.length - 1; // pointer for 2

        while (mid <= high) {
            if (arr[mid] == 0) {
                // Swap arr[mid] and arr[low]
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;

                low++;
                mid++;
            } else if (arr[mid] == 1) {
                // Element is already at the correct position
                mid++;
            } else if (arr[mid] == 2) {
                // Swap arr[mid] and arr[high]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 1, 0, 2};
        System.out.println("Original array: " + Arrays.toString(arr));

        sortArray(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}

/*  Output
Original array: [2, 0, 1, 1, 0, 2]
Sorted array: [0, 0, 1, 1, 2, 2]
 */