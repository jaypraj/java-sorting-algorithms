package com.jaypraj.algorithms.sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <strong>Quick Sort:&nbsp;</strong>
 * Quick sort algorithm is one of the most efficient algorithms. It's called Quick sort as it sorts the list significantly
 * faster than other sorting algorithms. In this algorithm, the array is split (partition) into sub-arrays, based on the
 * value of it's pivot element, and the elements are swapped (exchange). Because of this it's also called "Partition Exchange"
 * algorithm. The sub-arrays are sorted recursively. Like merge sort, it works on the principe of divide and conquer
 * methodology. It sorts the array in-place. Most sorting methods in programming languages use Quicksort.<br>
 * <strong>Worst-case Time Complexity:&nbsp;</strong>O(N^2)<br>
 * <strong>Average-case Time Complexity:&nbsp;</strong>O(N * log N)<br>
 * <strong>Space Complexity:&nbsp;</strong>O(1)
 */
public class QuickSort {
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

            quickSort(arr, 0, n - 1);
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void quickSort(int[] arr, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(arr, start, end);

            System.out.println("Iteration: " + ++iteration + "\tstart: " + start + "\tpivotIndex: " + pivotIndex + "\tend: " + end);
            System.out.println(Arrays.toString(arr));

            quickSort(arr, start, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivotIndex = start;
        int pivot = arr[end];

        for (int i = start; i < end; i++) {
            if (arr[i] <= pivot) {
                swap(arr, i, pivotIndex);
                pivotIndex++;
            }
        }

        swap(arr, pivotIndex, end);
        return pivotIndex;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
