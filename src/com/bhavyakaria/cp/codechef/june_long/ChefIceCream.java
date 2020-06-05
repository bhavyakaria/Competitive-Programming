package com.bhavyakaria.cp.codechef.june_long;

/**
 * @author Bhavya Karia
 * created on 05/06/20
 */
public class ChefIceCream {
    public static void main(String[] args) {
        try {
            Scan s = new Scan();
            Print p = new Print();

            int t = s.scanInt();

            while (t-- > 0) {
                int n = s.scanInt();
                int[] a = new int[n];

                for (int i = 0; i < n; i++) {
                    a[i] = s.scanInt();
                }

                int total_5_coins = 0;
                int total_10_coins = 0;

                int flag = 1;
                for (int i = 0; i < n; i++) {
                    if (a[i] == 5) {
                        total_5_coins++;
                    } else if (a[i] == 10) {
                        if (total_5_coins == 0) {
                            flag = 0;
                            p.printLine("No");
                            break;
                        } else {
                            total_5_coins--;
                            total_10_coins++;
                        }
                    } else if (a[i] == 15) {
                        if (total_5_coins <= 1 && total_10_coins == 0) {
                            flag = 0;
                            p.printLine("No");
                            break;
                        } else {
                            if (total_10_coins > 0) {
                                total_10_coins--;
                            } else {
                                total_5_coins -= 2;
                            }
                        }
                    }
                }

                if (flag == 1) {
                    p.printLine("Yes");
                }
            }
            p.close();
        } catch (Exception e) {

        }
    }
}
