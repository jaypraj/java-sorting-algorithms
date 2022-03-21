package com.jaypraj.algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <strong>Bubble Sort:</strong>
 * The bubble sort is the comparison-bases sorting algorithm. It is the simplest and inefficient at the same time. It is
 * not used in the real-world applications, but used as an education tool as it represents the foundations of sorting.
 * It iterates over the list, comparing the adjacent elements, and swapping them if they are in the wrong order. For the
 * array of size n, we iterate through the array for n - 1 passes, and at i-th pass the i-the largest element gets to
 * its correct position. At ith pass, the ith largest element "bubbles up" to its correct position. Hence the name
 * bubble sort.<br>
 * <strong>Time Complexity:&nbsp;</strong>O(n^2)
 * <strong>Space Complexity:&nbsp;</strong>O(1)
 * <strong>Stability:&nbsp;</strong>Stable
 */
public class BubbleSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.print("Enter the numbers: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            bubbleSort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) { // n-1 passes
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j);
                    swapped = true;
                }
            }

            if (!swapped) { // The array is already sorted, and no need to continue the loop
                break;
            }
        }
    }

    private static void swap(int[] arr, int i) {
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
    }
}
