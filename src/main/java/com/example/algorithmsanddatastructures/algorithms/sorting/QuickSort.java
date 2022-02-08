/**
 * <h1>Implementation of selection sort</h1>
 * <p>
 * A sequential sort algorithm for sorting an array in ascending order
 * by selecting the smallest elements of the unsorted area and saving
 * them at the right index.
 * Works with all data-types that implement the Comparable interface.
 * Time complexity: O(n^2)
 *
 * @author  Tiemo Timtschenko
 * @version 1.0
 * @since   2021-12-10
 *
 * */

package com.example.algorithmsanddatastructures.algorithms.sorting;

import com.example.algorithmsanddatastructures.algorithms.arrayoperations.ArrayOperations;

public class QuickSort {

    /**
     * Sorting arr from left to right into ascending order
     * @param arr This is the arr that should be sorted
     * @param left This is the left bound
     * @param right This is the right bound
     * @param <T> This describes the type parameter
     */
    public static <T extends Comparable<T>> void quickSort(T[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int p = partition(arr, left, right);

        // Recursively sort left and right partitions
        quickSort(arr, left, p - 1);
        quickSort(arr, p + 1, right);
    }

    /**
     * Sorting arr into ascending order
     * @param arr
     * @param <T>
     */
    public static <T extends Comparable<T>> void quickSort(T[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    /**
     * Moves arr[left] into supposed position
     * @param arr This is the arr that should be sorted
     * @param left This is the left bound
     * @param right This is the right bound
     * @param <T> This describes the type parameter
     * @return returns supposed position of arr[left]
     */
    private static <T extends Comparable<T>> int partition(T[] arr, int left, int right) {
        // arr[left] is the pivot element
        int i = left + 1;
        int j = right;

        while (true) {

            // iterate from the left until one element is greater than the pivot element
            // this element is in the wrong partition
            while (i < right && arr[i].compareTo(arr[left]) <= 0) {
                i++;
            }

            // iterate from the right until one element is smaller than the pivot element
            // this element is in the wrong partition
            while (j > left && arr[j].compareTo(arr[left]) >= 0) {
                j--;
            }

            // stop if whole array iterated
            if (i >= j) {
                break;
            }

            // swap element with each other and continue with next elements
            // they are now in the right partition
            ArrayOperations.swap(arr, i, j);
            i++;
            j--;
        }

        // move pivot element to supposed position
        ArrayOperations.swap(arr, left, j);
        return j;
    }
}
