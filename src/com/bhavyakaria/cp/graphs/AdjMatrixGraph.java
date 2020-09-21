package com.bhavyakaria.cp.graphs;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author Bhavya Karia
 * created on 22/09/20
 */
public class AdjMatrixGraph {

    int vertices;
    int matrix[][];

    AdjMatrixGraph(int vertices) {
        this.vertices = vertices;
        this.matrix = new int[vertices][vertices];
    }

    void addEdge(int source, int destination) {
        this.matrix[source][destination] = 1;
        this.matrix[destination][source] = 1;
    }

    void printGraph() {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    void dfs(int source) {
        boolean[] visited = new boolean[vertices];
        visited[source] = true;

        Stack<Integer> stack = new Stack<>();
        stack.push(source);

        int x;
        System.out.println("The depth first order is:");
        System.out.println(source);

        while (!stack.isEmpty()) {
            x = stack.pop();
            for (int j = 0; j < vertices; j++) {
                if (matrix[x][j] == 1 && !visited[j]) {
                    stack.push(x);
                    visited[j] = true;
                    System.out.println(x);
                    x = j;
                    j = -1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Vertices:");
        int V = sc.nextInt();

        AdjMatrixGraph adjMatrixGraph = new AdjMatrixGraph(V);

        System.out.println("Enter Number Of Edges:");
        int E = sc.nextInt();

        for (int i = 0; i < E; i++) {
            System.out.println("Enter Source:");
            int source = sc.nextInt();

            System.out.println("Enter Destination:");
            int destination = sc.nextInt();

            adjMatrixGraph.addEdge(source, destination);
        }

        adjMatrixGraph.printGraph();
        adjMatrixGraph.dfs(0);
    }
}
