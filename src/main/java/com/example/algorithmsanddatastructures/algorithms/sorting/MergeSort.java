/**
 * <h1>Implementation of merge sort</h1>
 * <p>
 * A divide and conquer sort algorithm for sorting an array in ascending order
 * by sorting subarrays recursively and merging them together
 * Works with all data-types that implement the Comparable interface.
 * Time complexity: O(n^2)
 *
 * @author  Tiemo Timtschenko
 * @version 1.0
 * @since   2021-12-10
 *
 * */

package com.example.algorithmsanddatastructures.algorithms.sorting;

import java.util.Arrays;

public class MergeSort {

    /**
     * Sorting arr from left to right into ascending order
     * @param arr This is the array that should be sorted
     * @param left This is the left bound
     * @param right This is the right bound
     * @param <T> This describes the type parameter
     */
    public static <T extends Comparable<T>> void mergeSort(T[] arr, int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;
            // Recursively sort left half and right half
            // -> divide and conquer principle
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    /**
     * Sorting arr into ascending order
     * @param arr This is the array that should be sorted
     * @param <T> This describes the type parameter
     */
    public static <T extends Comparable<T>> void mergeSort(T[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    /**
     * Merging left to mid and mid to right and copying into arr
     * @param arr This is the array that should be sorted
     * @param <T> This describes the type parameter
     */
    private static <T extends Comparable<T>> void merge(T[] arr, int left, int mid, int right) {
        T[] hArr = (T[]) new Comparable[arr.length];

        // Copy relevant part to helper array
        for (int i = left; i <= right; i++) {
            hArr[i] = arr[i];
        }

        // Writing position
        int outPos = left;
        int leftPos = left;
        int rightPos = mid + 1;

        // Merge until one of both sub-arrays is empty
        while (leftPos <= mid && rightPos <= right) {
            // write smaller element of both sub-arrays to current position
            if(hArr[leftPos].compareTo(hArr[rightPos]) < 0) {
                arr[outPos++] = hArr[leftPos++];
            } else {
                arr[outPos++] = hArr[rightPos++];
            }
        }

        // If left sub-array is empty there is nothing more to do, the right sub-array elements are already in position
        // If right sub-array is empty copy remaining elements of left sub-array
        while (leftPos <= mid) {
            arr[outPos++] = hArr[leftPos++];
        }
    }
}
