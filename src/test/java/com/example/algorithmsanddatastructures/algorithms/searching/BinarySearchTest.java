package com.example.algorithmsanddatastructures.algorithms.searching;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.example.algorithmsanddatastructures.algorithms.searching.BinarySearch.binarySearch;
import static org.assertj.core.api.Assertions.assertThat;

public class BinarySearchTest {

    private Integer[] intArr = {0, 2, 5, 6, 10};
    private String[] strArr = {"a", "d", "e", "g", "m"};

    // Integer Tests
    @Test
    @DisplayName("Find element 5 in the integer array {0, 2, 5, 6, 10} at index 2")
    public void testIntArrFind5atIndex2() {
        int ret = binarySearch(intArr, 5);
        assertThat(ret).isEqualTo(2);
    }

    @Test
    @DisplayName("Find element 10 in the integer array {0, 2, 5, 6, 10} at index 4")
    public void testIntArrFind10atIndex4() {
        int ret = binarySearch(intArr, 10);
        assertThat(ret).isEqualTo(4);
    }

    @Test
    @DisplayName("Dont find element 11 in the integer array {0, 2, 5, 6, 10}, instead return length")
    public void testIntArrDontFind11() {
        int ret = binarySearch(intArr, 11);
        assertThat(ret).isEqualTo(intArr.length);
    }

    // String Tests
    @Test
    @DisplayName("Find element \"d\" in the string array {\"a\", \"d\", \"e\", \"g\", \"m\"} at index 1")
    public void testStringArrFindDatIndex1() {
        int ret = binarySearch(strArr, "d");
        assertThat(ret).isEqualTo(1);
    }

    @Test
    @DisplayName("Find element \"m\" in the string array {\"a\", \"d\", \"e\", \"g\", \"m\"} at index 1")
    public void testStringArrFindMatIndex4() {
        int ret = binarySearch(strArr, "m");
        assertThat(ret).isEqualTo(4);
    }

    @Test
    @DisplayName("Dont find element \"n\" in the string array {\"a\", \"d\", \"e\", \"g\", \"m\"}, instead return the length")
    public void testStringArrDontFindN() {
        int ret = binarySearch(strArr, "n");
        assertThat(ret).isEqualTo(5);
    }

}
