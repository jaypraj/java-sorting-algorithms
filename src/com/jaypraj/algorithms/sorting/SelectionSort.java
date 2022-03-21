package com.jaypraj.algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <strong>Selection Sort:</strong>
 * The selection sort algorithm is the comparison-based, in-place algorithm and requires no extra memory.
 * The idea behind selection sort is that it divides the array into two sub-arrays: sorted and unsorted.
 * Initially, the sorted array is empty, and the unsorted array is the entire array. Until the unsorted array is empty,
 * we find the minimum element from the unsorted array and swap it with the left-most element of the unsorted array.
 * The left-most element of the unsorted array, now becomes the right-most element of the sorted array.<br>
 * <strong>Time Complexity:&nbsp;</strong>O(n^2)
 * <strong>Space Complexity:&nbsp;</strong>O(1)
 * <strong>Stability:&nbsp;</strong>Stable
 */
public class SelectionSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.print("Enter the numbers: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            selectionSort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = findMinIndex(arr, i);

            if (i != minIndex) {
                swap(arr, i, minIndex);
            }
        }
    }

    private static int findMinIndex(int[] arr, int start) {
        int minIndex = start;

        for (int i = start + 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
