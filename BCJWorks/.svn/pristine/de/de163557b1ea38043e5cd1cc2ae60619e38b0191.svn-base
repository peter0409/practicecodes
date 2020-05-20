package com.nivtek.corejava.datatypes.arrays.lab2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.nivtek.corejava.datatypes.arrays.lab1.ArrayFunctions;

class OddNumbersTest {

    @Test
    void oddNumbersTest() {

        int[] numbersArray = { 9, 8, 10, 12, 18, 20, 21, 5, 36, 3 };
        ArrayList<Integer> resultExpected = new ArrayList<Integer>();
        resultExpected.add(9);
        resultExpected.add(21);
        resultExpected.add(5);
        resultExpected.add(3);

        ArrayFunctions object = new ArrayFunctions();
        ArrayList<Integer> result = object.getAllOddNumbers(numbersArray);
        for (int a : result) {
            System.out.println(a);
        }

        assertEquals(resultExpected, result);

    }

}
