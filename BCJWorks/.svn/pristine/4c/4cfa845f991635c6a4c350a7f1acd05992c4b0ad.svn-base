package com.nivtek.corejava.datatypes.arrays.lab3;

import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        System.out.println("Enter the value of n :");
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.next());
        s.close();
        int[] series = getFibonacci(n);
        for(int i : series) {
            System.out.print(i + "\t");
        }

    }
    
    public static int[] getFibonacci(int n) {
        int[] series = new int[n];
        if(n==1) {
            series[0] = 1;
        }
        if(n==2) {
            series[0] = 1;
            series[1] = 2;
        }
        if(n>2) {
            series[0] = 1;
            series[1] = 2;
            for(int i=2; i<n; i++) {
                series[i] = series[i-1] + series[i-2];
            }
        }
        return series;
    }

}
