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

package com.example.aldat.algorithms.sorting;

public class SelectionSort {

    /**
     * Sorting arr in ascending order
     * @param arr This is the arr that should be sorted
     * @param <T> This describes the type parameter
     */
    public static <T extends Comparable<T>> void selectionSort(T[] arr) {
        for (int i = 0; i < arr.length - 1 ; i++) {
            int minPos = i;

            // Find the smallest element in arr[i, ..., n-1]
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j].compareTo(arr[minPos]) < 0) minPos = j;
            }

            swap(arr, i, minPos);
        }
    }

    /**
     * Swap element at index i with element at index j in arr
     * @param arr This is the array where the elements should be swapped
     * @param i This is the index of the first element that should be swapped
     * @param j This is the index of the second element that should be swapped
     * @param <T> This describes the type parameter
     */
    private static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
