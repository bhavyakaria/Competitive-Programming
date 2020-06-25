package com.bhavyakaria.cp.codeforces.contest_651;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author Bhavya Karia
 * created on 20/06/20
 */
public class MaximumGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            BigInteger n = new BigInteger(String.valueOf(sc.nextInt()));
            long maxGcd = Long.MIN_VALUE;
            for (int i = n.intValue(); i > 0 ; i--) {
                for (int j = i-1; j < n.intValue(); j++) {
                    maxGcd = Math.max(maxGcd, new BigInteger(String.valueOf(j)).gcd(new BigInteger(String.valueOf(i))).longValue());
                }

            }
            System.out.println(maxGcd);
        }


    }
}
