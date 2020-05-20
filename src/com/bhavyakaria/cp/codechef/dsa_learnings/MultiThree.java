package com.bhavyakaria.cp.codechef.dsa_learnings;

import java.util.Scanner;

/**
 * @author Bhavya Karia
 * created on 20/05/20
 */
public class MultiThree {
    public static void main(String[] args) {
        try {
//            Print p = new Print();
//            Scan s = new Scan();
            Scanner s = new Scanner(System.in);

//            int t = s.scanInt();
            int t = s.nextInt();

            while (t-- > 0) {
                long k = s.nextLong();
                long d0 = s.nextLong();
                long d1 = s.nextLong();

                long S = d0 + d1;
                long c = ((2*S) % 10) + ((4*S) % 10) + ((8*S) % 10)+ ((6*S) % 10);

                long cycles = (k - 3)/4;
                long total = 0;

                if (k == 2) {
                    total = S;
                } else {
                    total = S + (S % 10) + (c * cycles);
                    long leftover =  (k - 3) - (cycles*4);

                    long P = 2;
                    for (int i = 1; i <= leftover; i++) {
                        total += ((P*S)%10);
                        P = (P*2) % 10;
                    }
                }
//                p.printLine((total%3) == 0 ? "YES" : "NO" );
                System.out.print(total % 3 == 0 ? "YES\n" : "NO\n");
            }
        } catch (Exception e) {

        }
    }
}
