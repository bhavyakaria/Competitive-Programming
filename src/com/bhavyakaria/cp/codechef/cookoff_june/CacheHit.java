package com.bhavyakaria.cp.codechef.cookoff_june;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Bhavya Karia
 * created on 21/06/20
 */
public class CacheHit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int N = sc.nextInt();
            int B = sc.nextInt();
            int M = sc.nextInt();

            int total = 0;
            int[] arr = new int[M];
            for (int i = 0; i < M; i++) {
                arr[i] = sc.nextInt();
            }

            int cache = Integer.MIN_VALUE;
            for (int i = 0; i < M; i++) {
                int K;
                if ((arr[i] + 1) % B == 0) {
                    K = (arr[i]+1)/B;
                } else {
                    K = ((arr[i]+1)/B) + 1;
                }
                if (K != cache) {
                    total++;
                }
                cache = K;
            }
            System.out.println(total);
        }
    }
}
