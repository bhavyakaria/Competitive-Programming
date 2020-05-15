package com.bhavyakaria.cp.graphs;

import java.util.*;

/**
 * @author Bhavya Karia
 * created on 01/05/2020
 */
public class TopologicalSort
{
    Set<Node> stack;

    public TopologicalSort() {
        stack = new HashSet<>();
    }
    static class Node
    {
        int data;
        boolean visited;
        List<Node> neighbours;

        Node(int data)
        {
            this.data=data;
            this.neighbours=new ArrayList<>();

        }
        public void addneighbours(Node neighbourNode)
        {
            this.neighbours.add(neighbourNode);
        }
        public List<Node> getNeighbours() {
            return neighbours;
        }
        public void setNeighbours(List<Node> neighbours) {
            this.neighbours = neighbours;
        }
        public String toString()
        {
            return ""+data;
        }
    }

    // Recursive toplogical Sort
    public  void toplogicalSort(Node node)
    {
        List<Node> neighbours=node.getNeighbours();
        for (int i = 0; i < neighbours.size(); i++) {
            Node n=neighbours.get(i);
            if(n!=null && !n.visited)
            {
                toplogicalSort(n);
                n.visited=true;
            }
        }
        if (stack.contains(node)) {
            return;
        } else {
            stack.add(node);
        }
    }

    public static void main(String arg[])
    {

        TopologicalSort topological = new TopologicalSort();
        Node node40 =new Node(40);
        Node node10 =new Node(10);
        Node node20 =new Node(20);
        Node node30 =new Node(30);
        Node node60 =new Node(60);
        Node node50 =new Node(50);
        Node node70 =new Node(70);

        node40.addneighbours(node10);
        node10.addneighbours(node30);
        node10.addneighbours(node20);
        node20.addneighbours(node30);
        node20.addneighbours(node40);
        node20.addneighbours(node60);
        node20.addneighbours(node50);
        node30.addneighbours(node60);
        node60.addneighbours(node70);
        node50.addneighbours(node70);

        System.out.println("Topological Sorting Order:");
        topological.toplogicalSort(node40);

        // Print contents of stack
        Set<Node> resultStack=topological.stack;
        while (!resultStack.isEmpty())
            System.out.print(resultStack.iterator().next() + " ");
    }

}
