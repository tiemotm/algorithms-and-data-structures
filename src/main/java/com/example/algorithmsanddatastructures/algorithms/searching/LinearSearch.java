/**
 * <h1>Implementation of linear search</h1>
 * <p>
 * A sqeuantial search algorithm for searching an element x in a sorted array A
 * by traversing whole array.
 * Works with all data-types that implement the Comparable interface.
 * Time complexity: O(n)
 *
 * @author  Tiemo Timtschenko
 * @version 1.0
 * @since   2021-12-10
 *
 * */

package com.example.aldat.algorithms.searching;

public class LinearSearch {

    /**
     * Search element x in array arr from left to right
     * @param arr This is the array where to search the element
     * @param x This is the element to search
     * @param left This is the left bound for the searching area
     * @param right This is the right bound for the searching area
     * @param <T> This describes the type parameter
     * @return int This returns the index of the element x or the length of the array
     */
    public static <T extends Comparable<T>> int linearSearch(T[] arr, T x, int left, int right) {
        if(left > right) {
            throw new IllegalArgumentException("Left bound should be smaller or equal than the right bound");
        }

        for (int i = left; i <= right; i++) {
            if(arr[i].compareTo(x) == 0) return i;
        }

        return arr.length;
    }

    /**
     * Search element x in array arr from left to right
     * @param arr This is the array where to search the element
     * @param x This is the element to search
     * @param <T> This describes the type parameter
     * @return int This returns the index of the element x or the length of the array
     */
    public static <T extends Comparable<T>> int linearSearch(T[] arr, T x) {
        return linearSearch(arr, x, 0, arr.length - 1);
    }
}
