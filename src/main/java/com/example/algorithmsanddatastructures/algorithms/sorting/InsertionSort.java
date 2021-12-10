/**
 * <h1>Implementation of insertion sort</h1>
 * <p>
 * A sequential sort algorithm for sorting an array in ascending order
 * by inserting the first element of the unsorted area
 * into the right place of the sorted area.
 * Works with all data-types that implement the Comparable interface.
 * Time complexity: O(n^2)
 *
 * @author  Tiemo Timtschenko
 * @version 1.0
 * @since   2021-12-10
 *
 * */

package com.example.algorithmsanddatastructures.algorithms.sorting;

public class InsertionSort {

    /**
     * Sorting arr in ascending order
     * @param arr This is the arr that should be sorted
     * @param <T> This describes the type parameter
     */
    public static <T extends Comparable<T>> void insertionSort(T[] arr) {
        for (int i = 1; i < arr.length; i++) {
            T key = arr[i];
            int j = i - 1;

            // move key as long as key is smaller than the current element in sorted area
            while(j >= 0 && key.compareTo(arr[j]) < 0) {
                arr[j + 1] = arr[j];
                j--;
            }
        }
    }
}
