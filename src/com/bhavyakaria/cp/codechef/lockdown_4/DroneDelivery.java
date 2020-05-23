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
            for (int i = 0; i < n; i++) {
                houses.add(s.nextInt());
            }

            int ans = Integer.MAX_VALUE;
            int[] jumps = new int[n];
            for (int i = 0; i < houses.size()-1; i++) {
                ans = Math.min(ans, (houses.get(i+1) - houses.get(i)));
                jumps[i] = houses.get(i+1) - houses.get(i);
            }

            int fin = ans;

            int low = houses.get(0);
            int high = houses.get(houses.size()-1);
            int jump = ans;

            boolean[] visited = new boolean[n];
            while (R+jump <= high) {
                int x = R+jump;
                int y = R-jump;
                if (houses.contains(x) || houses.contains(y)) {
                    visited[houses.indexOf(x)] = true;
                }
                jump = ans * 2;
            }

            for (int i = 0; i < visited.length; i++) {
                if (!visited[i]) {
                    fin = 1;
                    break;
                }
            }

            System.out.println(fin);

        } catch (Exception e) {

        }
    }
}

// 3 5 10