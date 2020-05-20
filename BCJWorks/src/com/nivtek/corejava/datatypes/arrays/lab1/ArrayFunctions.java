/**
 * 
 */
package com.nivtek.corejava.datatypes.arrays.lab1;

import java.util.ArrayList;

/**
 * @author Bootcamp User 017
 *
 */
public class ArrayFunctions {

    ArrayList<Integer> result;

    /**
     * @param numbersArray
     */
    public ArrayList<Integer> getAllOddNumbers(int[] numbersArray) {

        result = new ArrayList<Integer>();
        for (int a : numbersArray) {
            if (a % 2 != 0) {
                result.add(a);
            }
        }
        return result;
    }

    public void printEvenNumberPlusTwo(int[] numbersArray) {

        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] % 2 == 0) {
                numbersArray[i] = numbersArray[i] + 2;
            }
        }

        System.out.print("The new array with even value plus 2 is: ");
        for (int a : numbersArray) {
            System.out.print(a + "\t");

        }
        System.out.println();
    }

    public void divisiblebyThree(int[] numbersArray) {

        System.out.print("The numbers divisibleby 3 in the array are: ");
        for (int a : numbersArray) {
            if (a % 3 == 0) {
                System.out.print(a + "\t");
            }
        }
        System.out.println();
    }

    public float printAverage(int[] numberArray) {
        int sum = 0;
        for (int s : numberArray) {
            sum = sum + s;
        }

        float avg = sum / numberArray.length;
        System.out.println("Average of array elements is: " + avg);
        return avg;

    }

    public void printHighest(int[] numberArray) {
        int max = numberArray[0];
        for (int i : numberArray) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println("The highest value is: " + max);
    }

    public void printLowest(int[] numberArray) {
        int min = numberArray[0];
        for (int i : numberArray) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println("The lowest value is: " + min);
    }

    public void printLessThanAverage(int[] numberArray, float avg) {
        System.out.println("The numbers less than average value are: ");
        for (int i : numberArray) {
            if (i < avg) {
                System.out.println(i);
            }
        }
    }

}
