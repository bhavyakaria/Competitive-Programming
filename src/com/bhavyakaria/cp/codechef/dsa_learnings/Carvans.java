package com.bhavyakaria.cp.codechef.dsa_learnings;

/**
 * @author Bhavya Karia
 * created on 20/05/20
 */
public class Carvans {
    public static void main(String[] args) {
        try {
            Scan s = new Scan();
            Print p = new Print();

            int t = s.scanInt();

            while (t-- > 0) {
                int n = s.scanInt();

                int[] speed = new int[n];
                for (int i = 0; i < n; i++) {
                    speed[i] = s.scanInt();
                }

                int count = 1;
                int smallest = speed[0];
                for (int i = 1; i < n; i++) {
                    if (smallest > speed[i]) smallest = speed[i];
                    if (speed[i] <= speed[i-1] && speed[i] <= smallest) {
                        count++;
                    }
                }
                p.printLine(String.valueOf(count));
            }
            p.close();
        } catch (Exception e) {

        }
    }
}
