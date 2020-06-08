package com.bhavyakaria.cp.codechef.june_long;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @author Bhavya Karia
 * created on 07/06/20
 */
public class EvenMatrix {
    public static void main(String[] args) {
        try {
            Scan s = new Scan();
            Print p = new Print();

            int t = s.scanInt();

            while (t-- > 0) {
                int n = s.scanInt();

                Queue<Long> oddNum = new LinkedList<>();
                Queue<Long> evenNum = new LinkedList<>();

                for (long i = 1; i <= n*n; i++) {
                    if (i % 2 == 0) {
                        evenNum.add(i);
                    } else {
                        oddNum.add(i);
                    }
                }

                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= n; j++) {
                        if (i % 2 != 0) {
                            if (j % 2 != 0) {
                                p.print(oddNum.poll()+" ");
                            } else {
                                p.print(evenNum.poll()+" ");
                            }
                        } else {
                            if (j % 2 == 0) {
                                p.print(oddNum.poll()+" ");
                            } else {
                                p.print(evenNum.poll()+" ");
                            }
                        }
                    }
                    p.printLine("");
                }
            }
            p.close();
        } catch (Exception e) {

        }
    }
}
