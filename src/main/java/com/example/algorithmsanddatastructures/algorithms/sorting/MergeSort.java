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

import java.sql.Array;
import java.util.Arrays;

public class MergeSort {

    public static <T extends Comparable<T>> void mergeSort(T[] arr, int left, int right) {
        if(left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static <T extends Comparable<T>> void mergeSort(T[] arr) {
        mergeSort(arr, 0, arr.length - 1);
    }

    private static <T extends Comparable<T>> void merge(T[] arr, int left, int mid, int right) {
        T[] hArr = Arrays.copyOf(arr, arr.length);

        for (int i = 0; i <= right; i++) {
            hArr[i] = arr[i];
        }

        int outPos = left;
        int leftPos = left;
        int rightPos = mid + 1;

        while (leftPos <= mid && rightPos <= right) {
            if(hArr[leftPos].compareTo(hArr[rightPos]) < 0) {
                arr[outPos++] = hArr[leftPos++];
            } else {
                arr[outPos++] = hArr[rightPos++];
            }
        }

        while (leftPos <= mid) {
            arr[outPos++] = hArr[leftPos++];
        }
    }
}
