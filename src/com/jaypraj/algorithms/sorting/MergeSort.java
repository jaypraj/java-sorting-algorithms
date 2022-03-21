package com.jaypraj.algorithms.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * <strong>Merge Sort:&nbsp;</strong>
 * Merge sort is one of the most-efficient sorting algorithm. Merge sort works on the principle of divide-and-conquer
 * methodology. The array is divided into two sub-arrays, then these sub-arrays are recursively sorted, and merged
 * together into a single sorted array. The merge operation compares the elements of two sub-arrays, and place the
 * appropriate element first in the merged array. It takes a temporary array to store the merged array.<br>
 * <strong>Worst-case Time Complexity:&nbsp;</strong>O(N * log N)<br>
 * <strong>Space Complexity:&nbsp;</strong>O(N)<br>
 * <strong>Stability:&nbsp;</strong>Stable
 */
public class MergeSort {
    private static int iteration = 0;

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the size of array: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.print("Enter the numbers: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            mergeSort(arr, 0, n);
        }
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if (start < end - 1) {
            int mid = (start + end) / 2;

            System.out.println("Iteration: " + ++iteration + "\tstart: " + start + "\tmid: " + mid + "\tend: " + end);

            mergeSort(arr, start, mid);
            mergeSort(arr, mid, end);
            merge(arr, start, mid, end);
            System.out.println(Arrays.toString(arr));
            System.out.println();
        }
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start];
        int i = start;
        int j = mid;
        int k = 0;

        while (i < mid && j < end) {
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while (i < mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j < end) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for (i = start; i < end; i++) {
            arr[i] = temp[i - start];
        }
    }
}
