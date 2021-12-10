package com.example.algorithmsanddatastructures.algorithms.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.example.algorithmsanddatastructures.algorithms.sorting.SelectionSort.selectionSort;
import static org.assertj.core.api.Assertions.assertThat;

public class SelectionSortTest {

    private Integer[] intArr = {5, 2, 100, 32, 57};
    private String[] strArr = {"h", "a", "j", "l", "o"};

    @Test
    @DisplayName("Sort integer array {5, 2, 100, 32, 57} into ascending order {2, 5, 32, 57, 100}")
    public void testIntArraySortedAscending() {
        selectionSort(intArr);
        assertThat(intArr).isSorted();
    }

    @Test
    @DisplayName("Sort string array {\"h\", \"a\", \"j\", \"l\", \"o\"} into ascending order {\"a\", \"h\", \"j\", \"l\", \"o\"}")
    public void testStringArraySortedAscending() {
        selectionSort(intArr);
        assertThat(intArr).isSorted();
    }
}
