package baekjoon.bdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/**
 *@see<a href="https://www.acmicpc.net/problem/1260">
 * https://www.acmicpc.net/problem/1260 DFS와 BFS
 *</a>
 */
public class BOJ_1260 {
    private static String DELIMITER= " ";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] firstLine =toIntArray(br.readLine());

        int nodeCount = firstLine[0];
        int linkCount = firstLine[1];
        int startNumber = firstLine[2];

        Graph graph = new Graph(nodeCount);

        for (int i = 0; i < linkCount; i++) {
            graph.addEdge(toIntArray(br.readLine()));
        }

        List<Node> dfsVisited = graph.dfsR(startNumber);
        System.out.println(joinToString(dfsVisited));

        graph.clearMark();

        List<Node> bfsVisited = graph.bfs(startNumber);
        System.out.println(joinToString(bfsVisited));

        br.close();
    }

    private static String joinToString(List<Node> result) {
        return result.stream()
                .map(it -> String.valueOf(it.getData()))
                .collect(Collectors.joining(DELIMITER));
    }

    private static int[] toIntArray(String readLine) {
        return Arrays.stream(readLine.split(DELIMITER)).mapToInt(Integer::parseInt).toArray();
    }
}

class Node implements Comparable<Node>{
    private int data;
    private LinkedList<Node> adjacent;
    private boolean marked;

    public Node(int data) {
        this.data = data;
        this.marked = false;
        adjacent = new LinkedList<>();
    }

    public int getData() {
        return data;
    }

    public LinkedList<Node> getAdjacent() {
        return adjacent;
    }

    public boolean isMarked() {
        return marked;
    }

    public void mark() {
        this.marked = true;
    }

    public void unMark() {
        this.marked = false;
    }

    @Override
    public int compareTo(Node node) {
        return getData() - node.getData();
    }

    @Override
    public String toString() {
        return String.valueOf(data);
    }
}

class Graph {
    private Node[] nodes;

    Graph(int size) {
        nodes = new Node[size];
        for (int i = 0; i < size; i++){
            nodes[i] = new Node(i+1);
        }
    }

    void addEdge(int i1, int i2){
        Node n1 = nodes[i1 - 1];
        Node n2 = nodes[i2 - 1];
        if(!n1.getAdjacent().contains(n2)){
            n1.getAdjacent().add(n2);
        }
        if(!n2.getAdjacent().contains(n1)){
            n2.getAdjacent().add(n1);
        }
    }

    void addEdge(int[] intArray) {
        addEdge(intArray[0], intArray[1]);
    }

    List<Node> bfs(int index){
        List<Node> visited = new ArrayList<>();

        Node root = nodes[index - 1];
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        root.mark();
        while(!queue.isEmpty()){
            Node r = queue.poll();

            List<Node> sortedNode = r.getAdjacent()
                    .stream()
                    .filter(node -> !node.isMarked())
                    .sorted()
                    .collect(Collectors.toList());

            if(!sortedNode.isEmpty()){
                for (Node node : sortedNode) {
                    node.mark();
                }
                queue.addAll(sortedNode);
            }

            visited.add(r);
        }

        return visited;
    }

    List<Node> dfsR(int index){
        List<Node> visited = new ArrayList<>();
        dfsR(nodes[index - 1], visited);
        return visited;
    }

    private void dfsR(Node r, List<Node> visited) {
        if (r == null) return;
        r.mark();
        visited.add(r);
        List<Node> sortedNode = r.getAdjacent()
                .stream()
                .filter(node -> !node.isMarked())
                .sorted()
                .collect(Collectors.toList());

        for (Node node : sortedNode) {
            if(!node.isMarked()){
                dfsR(node, visited);
            }
        }
    }

    public void clearMark() {
        for (Node n : nodes) {
            n.unMark();
        }
    }
}
