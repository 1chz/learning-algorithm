package baekjoon.bdfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @see <a href="https://www.acmicpc.net/problem/2606">
 * https://www.acmicpc.net/problem/2606 바이러스
 * </a>
 */

/*
7
6
1 2
2 3
1 5
5 2
5 6
4 7

4
 */
public class BOJ_2606 {
    public static void main(String[] args) throws IOException {
        final Solution2606 sol = new Solution2606();
        final Solution2606.Graph graph = sol.getGraph();
        System.out.println(sol.result(graph));
    }
}

class Solution2606{
    private static String DELIMITER = " ";

    int result(Graph graph){
        List<Node> nodes = graph.bfs(1);
        return nodes.size() - 1;
    }

    Graph getGraph() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int nodeCount = Integer.parseInt(br.readLine());
        int linkCount = Integer.parseInt(br.readLine());

        Graph graph = new Graph(nodeCount);

        for (int i = 0; i < linkCount; i++) {
            graph.addEdge(toIntArray(br.readLine()));
        }

        br.close();
        return graph;
    }

    private static int[] toIntArray(String readLine) {
        return Arrays.stream(readLine.split(DELIMITER)).mapToInt(Integer::parseInt).toArray();
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
}
