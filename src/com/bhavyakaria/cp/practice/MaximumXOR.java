package com.bhavyakaria.cp.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Bhavya Karia
 * created on 22/05/20
 */
public class MaximumXOR {

    static int one, two;
    public static void main(String[] args) {
        try {
            int[] a = new int[]{8, 10, 2};
            String[] s = new String[3];
            for (int i = 0; i < a.length; i++) {
                s[i] = decToBinary(a[i]);
            }

            int max = 0;
            for (int i = 0; i < s.length; i++) {
                max = Math.max(max, s[i].length());
            }

            for (int i = 0; i < s.length; i++) {
                if (s[i].length() != max) {
                    appendZeros(s, i, max);
                }
            }

            System.out.println(Arrays.toString(s));

            ArrayList<String> A = new ArrayList<>();
            ArrayList<String> B = new ArrayList<>();
            int i = 0;
            int size = s.length;
            while (size == s.length) {
                A.clear();
                B.clear();
                for (String str : s) {
                    if (str.charAt(i) == '1') {
                        A.add(str);
                    } else {
                        B.add(str);
                    }
                }
                i++;
                size = A.size();
            }

            findXOR(A, B, i-1, max);
            System.out.println(one ^ two);

        } catch (Exception e) {

        }
    }

    public static void findXOR(List<String> A, List<String> B, int index, int maxLen) {
        if (index == maxLen) {
//            one = Integer.parseInt(A.get(0), 2);
//            two = Integer.parseInt(B.get(0), 2);

            System.out.println(Arrays.toString(A.toArray()));
            System.out.println(Arrays.toString(B.toArray()));

            return;
        }
        List<String> tempA = new ArrayList<>();
        List<String> tempB = new ArrayList<>();

        for (String s : A) {
            if (s.charAt(index) == '1') {
                tempA.add(s);
            }
        }

        char check;
        if (tempA.size() == 0) {
            check = '1';
        } else {
            check = '0';
        }

        for (String s : B) {
            if (s.charAt(index) == check) {
                tempB.add(s);
            }
        }

        if (tempA.size() == 0) {
            tempA = A;
        }

        if (tempB.size() == 0) {
            tempB = B;
        }

        A = tempA;
        B = tempB;

        findXOR(A, B, index+1, maxLen);
    }

    public static void appendZeros(String[] s, int i, int maxLength) {
        StringBuilder sb = new StringBuilder(s[i]);
        int sLen = s[i].length();
        while (sLen < maxLength) {
            sb.insert(0, '0');
            sLen++;
        }
        s[i] = sb.toString();
    }

    public static String decToBinary(int n) {
        int[] binaryNum = new int[1000];
        int i = 0;
        while (n > 0) {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }

        StringBuilder sb = new StringBuilder();
        for (int j = i - 1; j >= 0; j--)
            sb.append(binaryNum[j]);
        return sb.toString();
    }
}
