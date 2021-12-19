package com.example.algorithmsanddatastructures.algorithms.arrayoperations;

public class ArrayOperations {

    /**
     * Swap element at index i with element at index j in arr
     * @param arr This is the array where the elements should be swapped
     * @param i This is the index of the first element that should be swapped
     * @param j This is the index of the second element that should be swapped
     * @param <T> This describes the type parameter
     */
    public static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
