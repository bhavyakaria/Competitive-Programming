package com.bhavyakaria.cp.codechef.dsa_learnings;

/**
 * @author Bhavya Karia
 * created on 20/05/20
 */
public class CoinFlip {
    public static void main(String[] args) {
        try {
            Scan s = new Scan();
            Print p = new Print();

            int t = s.scanInt();

            while (t-- > 0) {
                int g = s.scanInt();
                while (g-- > 0) {
                    long I = s.scanInt();
                    long N = s.scanInt();
                    long Q = s.scanInt();
                    long OG_N = N;
                    if (N % 2 == 0) {
                        N = (N/2);
                    } else {
                        N = (N+1)/2;
                    }

                    if ((I == 1 && Q == 2) || (I == 2 && Q == 1)) {
                        p.printLine(String.valueOf(N));
                    } else {
                        long ans = OG_N - N;
                        p.printLine(String.valueOf(ans));
                    }
                }
            }
            p.close();

        } catch (Exception e) {

        }
    }
}
