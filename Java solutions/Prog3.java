/*
Find the "Kth" max and min element of an array
 */

import java.util.*;

public class Prog3 {
        public static void findKthMinMax(int[] arr, int k) {
            if (arr == null || arr.length == 0 || k < 1 || k > arr.length) {
                System.out.println("Invalid input.");
                return;
            }

            // Sort the array in ascending order
            Arrays.sort(arr);
            System.out.println("Array: " + Arrays.toString(arr));
            int kthMin = arr[k - 1];
            int kthMax = arr[arr.length - k];

            System.out.println("Kth Minimum: " + kthMin);
            System.out.println("Kth Maximum: " + kthMax);
        }  
    


    
    public static void main(String args[]) {
        Scanner pp = new Scanner(System.in);
        int arrSize;
        arrSize = 1 + (int) Math.round(Math.random() * 10);
        System.out.println("Array Size: " + arrSize);
        int arr[] = new int[arrSize];
        for(int i = 0; i < arrSize; i++)
            arr[i]  = (int) Math.round(Math.random() * 100);
        int k = (int) Math.round(Math.random() * 10);

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("K: " + k);

        findKthMinMax(arr, k);
        pp.close();
    }
}
/*  Output
Array Size: 10
Array: [30, 16, 45, 67, 33, 45, 30, 4, 40, 66]
K: 6
Array: [4, 16, 30, 30, 33, 40, 45, 45, 66, 67]
Kth Minimum: 40
Kth Maximum: 33

Array Size: 4
Array: [3, 64, 90, 24]
K: 8
Invalid input.
 */