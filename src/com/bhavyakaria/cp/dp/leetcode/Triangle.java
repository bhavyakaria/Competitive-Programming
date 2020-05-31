package com.bhavyakaria.cp.dp.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Bhavya Karia
 * created on 27/05/20
 *
 * Link: https://leetcode.com/problems/triangle/submissions/
 * Time Complexity: O(N^2)
 */
public class Triangle {
    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Arrays.asList(-1));
        triangle.add(Arrays.asList(2,3));
        triangle.add(Arrays.asList(1,-1,-3));

        for(int i = triangle.size() - 2; i >= 0; i--)
            for(int j = 0; j <= i; j++)
                triangle.get(i).set(j, triangle.get(i).get(j) + Math.min(triangle.get(i + 1).get(j), triangle.get(i + 1).get(j + 1)));
        System.out.println(triangle.get(0).get(0));
    }
}
