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

    public static <T extends Comparable<T>> void quickSort(T[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int p = partition(arr, left, right);

        quickSort(arr, left, p - 1);
        quickSort(arr, p + 1, right);
    }

    public static <T extends Comparable<T>> void quickSort(T[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static <T extends Comparable<T>> int partition(T[] arr, int left, int right) {
        int i = left + 1;
        int j = right;

        while (true) {

            while (i < right && arr[i].compareTo(arr[left]) <= 0) {
                i++;
            }

            while (j > left && arr[j].compareTo(arr[left]) >= 0) {
                j--;
            }

            if (i >= j) {
                break;
            }

            ArrayOperations.swap(arr, i, j);
            i++;
            j--;
        }

        ArrayOperations.swap(arr, left, j);
        return j;
    }
}
