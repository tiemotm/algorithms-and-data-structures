package com.example.algorithmsanddatastructures.algorithms.sorting;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MergeSortTest {

    private Integer[] intArr = {5, 2, 100, 32, 57};
    private String[] strArr = {"h", "a", "j", "l", "o"};

    @Test
    @DisplayName("Sort integer array {5, 2, 100, 32, 57} into ascending order {2, 5, 32, 57, 100}")
    public void testIntArraySortedAscending() {
        MergeSort.mergeSort(intArr);
        assertThat(intArr).isSorted();
    }

    @Test
    @DisplayName("Sort string array {\"h\", \"a\", \"j\", \"l\", \"o\"} into ascending order {\"a\", \"h\", \"j\", \"l\", \"o\"}")
    public void testStringArraySortedAscending() {
        MergeSort.mergeSort(strArr);
        assertThat(strArr).isSorted();
    }
}
