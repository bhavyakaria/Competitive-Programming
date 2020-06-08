package com.bhavyakaria.cp.codechef.june_long;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Bhavya Karia
 * created on 07/06/20
 */
public class TomJerryFast {
    public static void main(String[] args) throws java.lang.Exception {
        try {
            FastReader s=new FastReader();

            int t = s.nextInt();

            while (t-- > 0) {
                long ts = s.nextLong();

                long total_zero = numberOfTrailingZeros(ts);

                long total = 0;
                if ((ts & 1) != 0) {
                    total = ts >> 1;
                } else {
                    long f = 1;
                    for (long i = 4; i < ts; i = i + 2) {

                        long total_i_zeros = numberOfTrailingZeros(i);
                        if (total_i_zeros > total_zero) {
                            f = i;
                            break;
                        }
                    }
                    if (f == 1) {
                        total = 0;
                    } else {
                        total = ts/f;
                    }
                }
                System.out.println(total);
            }

        } catch (Exception e) {

        }
    }

    public static long numberOfTrailingZeros(long i) {
        String st = Long.toBinaryString(i);
        int k = 0;
        int len = st.length() - 1;
        long total_zeros = 0;
        while (true) {
            if (st.charAt(len - k) == '1') {
                break;
            } else {
                total_zeros++;
                k++;
            }
        }
        return total_zeros;
    }

    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}
