package com.bhavyakaria.cp.codechef.dsa_learnings;

import java.util.HashMap;

/**
 * @author Bhavya Karia
 * created on 20/05/20
 */
public class Laddus {
    public static void main(String[] args) {
        try {
            Scan s = new Scan();
            Print p = new Print();

            int t = s.scanInt();

            while (t-- > 0) {
                int A = s.scanInt();
                String origin = s.scanString();
                HashMap<String, Integer> map = new HashMap<>();
                map.put("CONTEST_WON", 300);
                map.put("TOP_CONTRIBUTOR", 300);
                map.put("BUG_FOUND", 0);
                map.put("CONTEST_HOSTED", 50);

                long total = 0;
                for (int i = 0; i < A; i++) {
                    String activity = s.scanString();
                    int val = 0;
                    if (activity.equals("CONTEST_WON")) {
                        val = s.scanInt();
                        val = 20 - val;
                        val= val < 0 ? 0 : val;
                    } else if (activity.equals("BUG_FOUND")) {
                        val = s.scanInt();
                    }
                    total += map.get(activity) + val;
                }
                int div = origin.equals("INDIAN") ? 200 : 400;
                p.printLine(String.valueOf(total/div));
            }
            p.close();
        } catch (Exception e ) {

        }
    }
}
