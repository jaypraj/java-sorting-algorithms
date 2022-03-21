package com.jaypraj.algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <strong>Insertion Sort:&nbsp;</strong>
 * The elements are placed in their correct position as they come in an already sorted array. We iterate through each
 * elements starting from the first element, compare the current element with previous elements, which are already sorted,
 * then place the current element at appropriate place in the already sorted array.<br>
 * <strong>Worst-Case Time Complexity:&nbsp;</strong>O(N^2)<br>
 * <strong>Space Complexity:&nbsp;</strong>O(1)<br>
 * <strong>Stability:&nbsp;</strong>Stable
 */
public class InsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of list: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    /**
     * Sorts array using insertion sort algorithm
     * We iterate through each element of the array, and consider the left side of that array as already sorted and place the element at a proper position
     * @param arr array to be sorted
     */
    private static void insertionSort(int[] arr) {
        int len = arr.length;

        for(int i = 0; i < len; i++) {
            int element = arr[i];
            int j = i;
            while (j > 0 && arr[j - 1] > element) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = element;
            "".contains("".toLowerCase());
        }
    }
}
