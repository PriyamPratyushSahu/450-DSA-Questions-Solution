/*
Find the maximum and the minimum element in are array
 */

import java.util.*;

public class Prog2 {
    public static void findMinMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }


    
    public static void main(String args[]) {
        Scanner pp = new Scanner(System.in);
        int arrSize;
        arrSize = 1 + (int) Math.round(Math.random() * 10);
        System.out.println("Array Size: " + arrSize);
        int arr[] = new int[arrSize];
        for(int i = 0; i < arrSize; i++)
            arr[i]  = (int) Math.round(Math.random() * 100);

        System.out.println("Array: " + Arrays.toString(arr));
        findMinMax(arr);
        pp.close();
    }
}
/*  Output
Array Size: 10
Array: [69, 68, 93, 88, 48, 40, 24, 90, 0, 19]
Minimum: 0
Maximum: 93

Array Size: 6
Array: [76, 81, 50, 97, 11, 21]
Minimum: 11
Maximum: 97
 */