package com.bhavyakaria.cp.codechef.lunchtime_may;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Bhavya Karia
 * created on 30/05/20
 */
public class LostWeekend {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);

            int t = s.nextInt();

            while (t-- > 0) {
                List<Integer> work = new ArrayList<>();

                for (int i = 0; i < 5; i++) {
                    work.add(s.nextInt());
                }
                int p = s.nextInt();

                int totalWork = 0;
                for (int i = 0; i < work.size(); i++) {
                    totalWork += work.get(i) * p;
                }

                if (totalWork <= 24*5) {
                    System.out.println("No");
                } else {
                    System.out.println("Yes");
                }
            }
        } catch (Exception e) {

        }
    }
}
