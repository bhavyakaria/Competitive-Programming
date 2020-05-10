package com.bhavyakaria.cp.dp.common_problems;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {
        String string = "aaa";
        System.out.println(findLongestPalindromicSubstring(string));
    }

    public static String findLongestPalindromicSubstring(String s) {
        String ans = "";
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j <= s.length(); j++) {
                String subString = sb.substring(i, j);
                System.out.println(subString);
                String reverse = new StringBuilder(subString).reverse().toString();
                if (reverse.equals(subString) && reverse.length() > ans.length()) {
                    ans = subString;
                }
            }
        }
        return ans;
    }
}
