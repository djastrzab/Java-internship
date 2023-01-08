package com.company;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;


class BubbleSortTest {
    @Test
    void intSort(){
        assertEquals(Arrays.asList(1,3,4,5,6,8,8),BubbleSort.sort(Arrays.asList(1,4,5,6,8,3,8)));
    }

}