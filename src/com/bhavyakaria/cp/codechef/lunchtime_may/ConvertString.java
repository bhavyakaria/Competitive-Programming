package com.bhavyakaria.cp.codechef.lunchtime_may;

import java.util.*;

/**
 * @author Bhavya Karia
 * created on 03/06/20
 */
public class ConvertString {
    public static void main(String[] args) {
        try {
            Scanner s = new Scanner(System.in);
            int t = s.nextInt();

            while (t-- > 0) {
                int n = s.nextInt();

                char[] a = s.next().toCharArray();
                char[] b = s.next().toCharArray();

                int[] map = new int[26];
                Arrays.fill(map, -1);
                for (int i = 0; i < a.length; i++) {
                    char c = a[i];
                    if (map[c - 'a'] == -1) {
                        map[c - 'a'] = i;
                    }
                }

                int flag = 1;
                TreeMap<Character, List<Integer>> result = new TreeMap<>(Collections.reverseOrder());

                for (int i = 0; i < b.length; i++) {
                    char char_in_a = a[i];
                    char char_in_b = b[i];
                    if (char_in_a > char_in_b && map[char_in_b - 'a'] != -1) {

                        if (result.containsKey(char_in_b)) {
                            List<Integer> temp = result.get(char_in_b);
                            temp.add(i);
                            result.replace(char_in_b, temp);
                        } else {
                            List<Integer> temp = new ArrayList<>();
                            temp.add(i);
                            result.put(char_in_b, temp);
                        }

                    } else if (char_in_b > char_in_a || map[char_in_b - 'a'] == -1) {
                        flag = 0;
                        System.out.println("-1");
                        break;
                    }
                }

                if (flag == 1) {
                    System.out.println(result.size());
                    for (Map.Entry<Character, List<Integer>> entry : result.entrySet()) {
                        int c = map[entry.getKey() - 'a'];
                        List<Integer> list = entry.getValue();
                        list.add(c);
                        Collections.sort(list);
                        System.out.print(list.size()+" ");
                        for (int i = 0; i < list.size(); i++) {
                            System.out.print(list.get(i) +" ");
                        }
                        System.out.println("");
                    }
                }
            }
        } catch (Exception e) {

        }
    }
}
