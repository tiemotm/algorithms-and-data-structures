/**
 * <h1>Implementation of binary search</h1>
 * <p>
 * An interval search algorithm for searching an element x in a sorted array A
 * by splitting into two sub-arrays.
 * Works with all data-types that implement the Comparable interface.
 * Time complexity: O(log(n))
 *
 * @author  Tiemo Timtschenko
 * @version 1.0
 * @since   2021-12-10
 *
 * */

package com.example.aldat.algorithms.searching;

public class BinarySearch {

    /**
     * Search element x in array arr from left to right
     * @param arr This is the array where to search the element
     * @param x This is the element to search
     * @param left This is the left bound for the searching area
     * @param right This is the right bound for the searching area
     * @param <T> This describes the type parameter
     * @return int This returns the index of the element x or the length of the array
     */
    public static <T extends Comparable<T>> int binarySearch(T[] arr, T x, int left, int right) {
        if (left > right) {
            throw new IllegalArgumentException("Left bound should be smaller or equal than the right bound");
        }

        // While left bound is smaller or equal to the right bound
        // If not then x is not in arr
        while(left <= right) {
            int mid = (left + right) / 2;

            // If x is smaller than the element in the mid it must be in the right sub-array
            if(arr[mid].compareTo(x) < 0) {
                left = mid + 1;
            }
            // If x is greater than the element in the mid it must be in the left sub-array
            else if(arr[mid].compareTo(x) > 0) {
                right = mid - 1;
            }
            // Else it is x and the index is returned
            else {
                return mid;
            }
        }

        return arr.length;
    }

    /**
     * Search element x in whole array arr
     * @param arr This is the array where to search the element
     * @param x This is the element to search
     * @param <T> This describes the type parameter
     * @return int This returns the index of the element x or the length of the array
     */
    public static <T extends Comparable<T>> int binarySearch(T[] arr, T x) {
        return binarySearch(arr, x, 0, arr.length - 1);
    }
}