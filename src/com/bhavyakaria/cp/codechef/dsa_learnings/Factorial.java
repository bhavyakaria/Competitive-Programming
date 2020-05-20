package com.bhavyakaria.cp.codechef.dsa_learnings;

/**
 * @author Bhavya Karia
 * created on 20/05/20
 */
public class Factorial {

    public static void main(String[] args) {
        try {

            Scan s = new Scan();
            Print p = new Print();

            int t = s.scanInt();

            while (t-- > 0) {
                int n = s.scanInt();

                int ans = 0, d=5;;
                while(n/d!=0) {
                    ans += n/d;
                    d*=5;
                }
                p.printLine(String.valueOf(ans));
            }
            p.close();
        } catch (Exception e) {

        }
    }

    public static int countZerosInFactorial(int n) {
        int res[] = new int[1000000];

        res[0] = 1;
        int res_size = 1;

        for (int x = 2; x <= n; x++)
            res_size = multiply(x, res, res_size);

        int count = 0;
        for (int i = 0; i < res.length; i++) {
            if (res[i] != 0) {
                break;
            }
            count++;
        }
        return count;
    }

    public static int multiply(int x, int[] res, int res_size) {
        int carry = 0;

        for (int i = 0; i < res_size; i++)
        {
            int prod = res[i] * x + carry;
            res[i] = prod % 10;
            carry = prod/10;
        }

        while (carry!=0)
        {
            res[res_size] = carry % 10;
            carry = carry / 10;
            res_size++;
        }
        return res_size;
    }
}
