package com.bhavyakaria.cp.codechef.lockdown_4;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Bhavya Karia
 * created on 23/05/20
 */
public class NameVal {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);

            int t = s.nextInt();

            while (t-- > 0) {
                String st = s.next();

                List<Character> vowels = new ArrayList<>();
                vowels.add('a');
                vowels.add('e');
                vowels.add('i');
                vowels.add('o');
                vowels.add('u');

                StringBuilder sb = new StringBuilder();
                for (Character c : st.toCharArray()) {
                    if (vowels.contains(c)) {
                        sb.append('0');
                    } else {
                        sb.append('1');
                    }
                }
                System.out.println(binaryToDecimal(sb.toString()));
            }
        } catch(Exception e) {

        }
    }

    static long binaryToDecimal(String n) {
        String num = n;
        long dec_value = 0;

        long base = 1;
        int len = num.length();
        for (int i = len - 1; i >= 0; i--) {
            if (num.charAt(i) == '1')
                dec_value = (dec_value + base) % 1000000007;
            base = (base * 2) % 1000000007;
        }
        return (dec_value);
    }
}
