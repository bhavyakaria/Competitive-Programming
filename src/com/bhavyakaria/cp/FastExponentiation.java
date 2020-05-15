package com.bhavyakaria.cp;

/**
 * @author Bhavya Karia
 * created on 01/05/2020
 */
public class FastExponentiation {

    public static long M = 1000000007;

    public static void main(String[] args) {
        final FastExponentiation exponentiation = new FastExponentiation();
        long num = exponentiation.power(8,10);
        System.out.println(num);
    }

    public long power(final int base, final int exp) {
        if (exp == 0) {
            return 1;
        } else {
            final long R = power(base, exp / 2) % M;
            if (exp % 2 == 0) {
                return (R * R) % M;
            } else {
                return (R * R * base) % M;
            }
        }
    }
}
