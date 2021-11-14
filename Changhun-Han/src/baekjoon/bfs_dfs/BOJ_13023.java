package src.baekjoon.bfs_dfs;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/13023">
 * https://www.acmicpc.net/problem/13023
 * </a>
 */
public class BOJ_13023 {

    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[][] flag = new boolean[n][n];
        List<Integer>[] friends = new ArrayList[n];
        List<Edge> edges = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            friends[i] = new ArrayList<>();
        }

        for (int i = 0; i < m; i++) {
            int from = sc.nextInt();
            int to = sc.nextInt();
            edges.add(new Edge(from, to));
            edges.add(new Edge(to, from));
            flag[from][to] = flag[to][from] = true;
            friends[from].add(to);
            friends[to].add(from);
        }
        m *= 2;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                int A = edges.get(i).from;
                int B = edges.get(i).to;
                int C = edges.get(j).from;
                int D = edges.get(j).to;

                if (A == B || A == C || A == D || B == C || B == D || C == D) {
                    continue;
                }

                if (!flag[B][C]) {
                    continue;
                }

                for (int E : friends[D]) {
                    if (A == E || B == E || C == E || D == E) {
                        continue;
                    }
                    System.out.println(1);
                    return;
                }

            }
        }
        System.out.println(0);
    }

    static class Edge {

        int from;
        int to;

        Edge(int from, int to) {
            this.from = from;
            this.to = to;
        }

    }

}




