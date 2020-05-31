package com.bhavyakaria.cp.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Bhavya Karia
 * created on 22/05/20
 */
public class MaximumXOR {

    public static void main(String[] args) {
        try {
            int[] a = new int[]{14,15,9,3,2};
            String[] s = new String[5];
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

            System.out.println(findXOR(A, B, i));

        } catch (Exception e) {

        }
    }

    public static int findXOR(List<String> A, List<String> B, int index) {

        if (A.size() == 0 || B.size() == 0) return 0;

        if (A.size() == 1 && B.size() == 1) {
            int one = Integer.parseInt(A.get(0), 2);
            int two = Integer.parseInt(B.get(0), 2);

            return one ^ two;
        }

        List<String> tempA0 = new ArrayList<>();
        List<String> tempA1 = new ArrayList<>();
        List<String> tempB0 = new ArrayList<>();
        List<String> tempB1 = new ArrayList<>();

        for (String s : A) {
            if (s.charAt(index) == '1') {
                tempA1.add(s);
            } else {
                tempA0.add(s);
            }
        }

        for (String s : B) {
            if (s.charAt(index) == '1') {
                tempB1.add(s);
            } else {
                tempB0.add(s);
            }
        }

        if (A.size() == 1) {
            tempA0 = A;
            tempA1 = A;
        }

        if (B.size() == 1) {
            tempB0 = B;
            tempB1 = B;
        }

        System.out.println("A0 -> " + Arrays.toString(tempA0.toArray()) +": index -> "+index);
        System.out.println("A1 -> " + Arrays.toString(tempA1.toArray()) +": index -> "+index);
        System.out.println("B0 -> " + Arrays.toString(tempB0.toArray()));
        System.out.println("B1 -> " + Arrays.toString(tempB1.toArray()));

        return Math.max(findXOR(tempA0, tempB1, index+1), findXOR(tempA1, tempB0, index+1));
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
