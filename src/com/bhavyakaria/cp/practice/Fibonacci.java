package com.bhavyakaria.cp.practice;

import java.util.Arrays;

/**
 * @author Bhavya Karia
 * created on 01/05/2020
 */
public class Fibonacci {
    public static void main(String[] args) {

        int N = 10; // Find first 9 fibonacci numbers

        int[] F = new int[N];
        F[0] = 0;
        F[1] = 1;

        for (int i = 2; i < N; i++) {
            F[i] = F[i - 1] + F[i - 2];
        }
        System.out.println(Arrays.toString(F));
    }
}
