/**
 * 
 */
package com.nivtek.corejava.datatypes.arrays.lab4;

/**
 * @author Bootcamp User 017
 *
 */
public class Power {

    public int[] power(int base, int power) {

        int[] result = new int[power];
        int i, value = 1;
        result[0] = value;

        for (i = 1; i < power; i++) {
            value = base * value;
            result[i] = value;

        }

        return result;
    }

}
