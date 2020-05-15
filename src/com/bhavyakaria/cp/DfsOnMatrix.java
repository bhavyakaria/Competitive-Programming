package com.bhavyakaria.cp;

/**
 * @author Bhavya Karia
 * created on 13/05/2020
 */
public class DfsOnMatrix {

    // restricted to four directions but can add diagonal traversals as well
    static int[] rowDir = new int[]{-1, +1, 0, 0};
    static int[] colDir = new int[]{0, 0, -1, +1};

    static int[][] matrix, visited;

    public static void main(String[] args) {

        int[][] matrix = new int[3][3];

        dfs(0, 0);
    }

    public static void dfs(final int row, final int col) {
        if (row < 0 || row >= matrix.length || col < 0 || col >= matrix[0].length || visited[row][col] == 1) {
            return;
        }

        for (int i = 0; i < rowDir.length; i++) {
            visited[row][col] = 1;
            int nextRow = rowDir[i];
            int nextCol = colDir[i];
            dfs(nextRow, nextCol);
        }
    }
}
