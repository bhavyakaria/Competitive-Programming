package com.bhavyakaria.cp.codechef.lockdown_4;

import java.util.*;

/**
 * @author Bhavya Karia
 * created on 23/05/20
 */
public class DroneDelivery {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);

            int n = s.nextInt();
            int R = s.nextInt();

            List<Integer> houses = new ArrayList<>();
            houses.add(R);
            for (int i = 0; i < n; i++) {
                houses.add(s.nextInt());
            }
            Collections.sort(houses);

            int diff = houses.get(1) - houses.get(0);
            for (int i = 2; i <= n; i++) {
                int val = houses.get(i) - houses.get(i-1);
                diff = gcd(diff, val);
            }
            System.out.println(diff);

        } catch (Exception e) {

        }
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;

        return gcd(b, a % b);
    }
}
