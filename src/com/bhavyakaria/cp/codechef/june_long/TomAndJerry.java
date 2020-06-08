package com.bhavyakaria.cp.codechef.june_long;

/**
 * @author Bhavya Karia
 * created on 06/06/20
 */
public class TomAndJerry {
    public static void main(String[] args) {
        try {
            Scan s = new Scan();
            Print p = new Print();

            int t = s.scanInt();

            while (t-- > 0) {
                int ts = s.scanInt();

                int total_zero = numberOfTrailingZeros(ts);

                int total = 0;
                if ((ts & 1) != 0) {
                    total = ts >> 1;
                } else {

                    for (int i = 4; i <= ts; i += 4) {

                        int total_i_zeros = numberOfTrailingZeros(i);

                        if (total_i_zeros > total_zero) {
                            p.printLine(String.valueOf(i));
                            total++;
                        }
                    }
                }
//                p.printLine(String.valueOf(total));
            }
            p.close();
        } catch (Exception e) {

        }
    }

    public static int numberOfTrailingZeros(int i) {
        // HD, Figure 5-14
        int y;
        if (i == 0) return 32;
        int n = 31;
        y = i <<16; if (y != 0) { n = n -16; i = y; }
        y = i << 8; if (y != 0) { n = n - 8; i = y; }
        y = i << 4; if (y != 0) { n = n - 4; i = y; }
        y = i << 2; if (y != 0) { n = n - 2; i = y; }
        return n - ((i << 1) >>> 31);
    }
}

// 101000 - 40
// 11000 - 24
// 10100 - 20
// 10000 - 16
// 10110 - 22

// 100 - 4
// 1000 - 8
// 1100 - 12
// 10000 - 16
// 10100 - 20