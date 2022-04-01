package com.jaypraj.algorithms.searching;

import java.util.Scanner;

public class RecursiveBinarySearch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter array size first, and then enter the array elements: ");
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter number to be searched: ");
            int x = sc.nextInt();

            System.out.println("Position: " + binarySearch(arr, x, 0, arr.length - 1));
        }
    }

    private static int binarySearch(int[] arr, int x, int start, int end) {
        if (start <= end) {
            int mid = (start + end) / 2;
            if (x < arr[mid]) return binarySearch(arr, x, start, mid - 1);
            else if (x > arr[mid]) return binarySearch(arr, x, mid + 1, end);
            else return mid;
        }
        return -1;
    }
}
