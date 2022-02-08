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

public class SelectionSort {

    /**
     * Sorting arr in ascending order
     * @param arr This is the array that should be sorted
     * @param <T> This describes the type parameter
     */
    public static <T extends Comparable<T>> void selectionSort(T[] arr) {
        for (int i = 0; i < arr.length - 1 ; i++) {
            // Find the smallest element in arr[i, ..., n-1]
            int minPos = i;

            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j].compareTo(arr[minPos]) < 0) minPos = j;
            }

            // Brings next smallest element into right position
            ArrayOperations.swap(arr, i, minPos);
        }
    }
}
