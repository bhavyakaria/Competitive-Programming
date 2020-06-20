package com.bhavyakaria.cp.codechef.june_long;

import java.util.Scanner;

/**
 * @author Bhavya Karia
 * created on 08/06/20
 */
public class CovidSample {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);

            int t = s.nextInt();

            while (t-- > 0) {
                int n = s.nextInt();
                int p = s.nextInt();
                int[][] mat = new int[n][n];
                int res = 0;

                for (int j = 1; j <= n; j++) {
                    for (int i = 1; i <= n; i++) {
                        System.out.println("1 "+j+" "+i+" "+j+" "+i);
                        System.out.flush();
                        res = s.nextInt();

                        if (res == 1) {
                            mat[j-1][i-1] = 1;
                        } else {
                            mat[j-1][i-1] = 0;
                        }
                    }
                }
                System.out.println("2");
                for (int j = 0; j < n; j++) {
                    for (int k = 0; k < n; k++) {
                        System.out.print(mat[j][k]+" ");
                    }
                    System.out.println();
                }

            }

        } catch (Exception e) {

        }
    }
}
