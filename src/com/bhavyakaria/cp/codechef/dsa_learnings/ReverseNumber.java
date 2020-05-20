package com.bhavyakaria.cp.codechef.dsa_learnings;

import java.util.Stack;

/**
 * @author Bhavya Karia
 * created on 20/05/20
 */
public class ReverseNumber {
    public static void main(String[] args) {
        try {
            Scan s = new Scan();
            Print p = new Print();

            int t = s.scanInt();

            while (t-- > 0) {
                Stack<Character> stack = new Stack<>();
                String str = s.scanString();
                for (Character c : str.toCharArray()) {
                    stack.push(c);
                }
                StringBuilder sb = new StringBuilder();
                while (!stack.isEmpty()) {
                    sb.append(stack.pop());
                }

                while (sb.charAt(0) == '0') {
                    sb.deleteCharAt(0);
                }
                p.printLine(sb.toString());
            }
            p.close();
        } catch (Exception e) {

        }
    }
}
