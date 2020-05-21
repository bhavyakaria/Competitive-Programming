package com.bhavyakaria.cp.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author Bhavya Karia
 * created on 21/05/20
 */
public class ByteIndianGoldCoins {
    static Map<Long, Long> map = new HashMap<>();
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);

            while (s.hasNextInt()) {
                long c = s.nextInt();
                long ans = findMax(c);
                System.out.println(ans);
            }
        } catch (Exception e) {

        }
    }

    public static long findMax(long c) {
        if (c < 12) return c;

        if (map.containsKey(c)) return map.get(c);

        long max = Math.max(c, findMax(c/2) + findMax(c/3) + findMax(c/4));
        map.put(c, max);
        return max;
    }
}

