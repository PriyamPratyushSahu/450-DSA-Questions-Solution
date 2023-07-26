/*
 Reverse the array
 */

import java.util.*;

public class Prog1 {
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move indices towards the middle
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        Scanner pp = new Scanner(System.in);
        int arrSize;
        /*System.out.print("Enter the size of the array: ");
        arrSize = pp.nextInt(); */
        arrSize = 1 + (int) Math.round(Math.random() * 10);
        System.out.println("Array Size: " + arrSize);
        int arr[] = new int[arrSize];
        /*System.out.format("\nEnter %d elements to array \n",arrSize);
        for(int i = 0; i < arrSize; i++)
            arr[i] = pp.nextInt(); */
        for(int i = 0; i < arrSize; i++)
            arr[i]  = (int) Math.round(Math.random() * 100);

        System.out.println("Original array: " + Arrays.toString(arr));

        reverseArray(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));
        pp.close();
    }
}
/*  Output
Array Size: 6
Original array: [95, 35, 63, 68, 95, 85]
Reversed array: [85, 95, 68, 63, 35, 95]

Array Size: 4
Original array: [56, 14, 75, 1]
Reversed array: [1, 75, 14, 56]
 */