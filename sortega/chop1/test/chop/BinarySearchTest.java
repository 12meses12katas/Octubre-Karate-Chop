package chop;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {

    @Test
    public void notFoundOnEmptyList() {
        assertEquals(-1, BinarySearch.find(3, new int[0]));
    }

    @Test
    public void notFoundOnSingletonList() {
        assertEquals(-1, BinarySearch.find(3, new int[]{1}));
    }

    @Test
    public void foundOnSingletonList() {
        assertEquals(0, BinarySearch.find(1, new int[]{1}));
    }

    @Test
    public void foundAtTheBegin() {
        assertEquals(0, BinarySearch.find(1, new int[]{1, 3, 5}));
    }

    @Test
    public void foundInOddSizedArray() {
        assertEquals(1, BinarySearch.find(3, new int[]{1, 3, 5}));
        assertEquals(2, BinarySearch.find(5, new int[]{1, 3, 5}));
        assertEquals(-1, BinarySearch.find(0, new int[]{1, 3, 5}));
        assertEquals(-1, BinarySearch.find(2, new int[]{1, 3, 5}));
        assertEquals(-1, BinarySearch.find(4, new int[]{1, 3, 5}));
        assertEquals(-1, BinarySearch.find(6, new int[]{1, 3, 5}));
    }

    @Test
    public void foundInEvenSizedArray() {
        assertEquals(0, BinarySearch.find(1, new int[]{1, 3, 5, 7}));
        assertEquals(1, BinarySearch.find(3, new int[]{1, 3, 5, 7}));
        assertEquals(2, BinarySearch.find(5, new int[]{1, 3, 5, 7}));
        assertEquals(3, BinarySearch.find(7, new int[]{1, 3, 5, 7}));
        assertEquals(-1, BinarySearch.find(0, new int[]{1, 3, 5, 7}));
        assertEquals(-1, BinarySearch.find(2, new int[]{1, 3, 5, 7}));
        assertEquals(-1, BinarySearch.find(4, new int[]{1, 3, 5, 7}));
        assertEquals(-1, BinarySearch.find(6, new int[]{1, 3, 5, 7}));
        assertEquals(-1, BinarySearch.find(8, new int[]{1, 3, 5, 7}));
    }

}
