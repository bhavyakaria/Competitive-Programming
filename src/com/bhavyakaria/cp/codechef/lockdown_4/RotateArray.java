package com.bhavyakaria.cp.codechef.lockdown_4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Bhavya Karia
 * created on 23/05/20
 */
public class RotateArray {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);

            int t = s.nextInt();

            while (t-- > 0) {
                int n = s.nextInt();
                int r = s.nextInt();

                int[] arr = new int[n];
                int[] temp = new int[n];
                for (int i = 0; i < n; i++) {
                    arr[i] = s.nextInt();
                }

                for (int i = 0; i < n; i++) {
                    temp[(i+r)%n] = arr[i];
                }

                System.out.println(Arrays.toString(temp));
            }
        } catch (Exception e) {

        }
    }
}

//1 2 3 4 5
//5 1 2 3 4 -> 1
//4 5 1 2 3 -> 2
//3 4 5 1 2 -> 3
//2 3 4 5 1 -> 4
//1 2 3 4 5 -> 5
//5 1 2 3 4 -> 6