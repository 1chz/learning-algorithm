package src.baekjoon.bronze100.b;

import java.io.*;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/2445">
 * https://www.acmicpc.net/problem/2445
 * </a>
 */
public class BOJ_2445 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            for (int j = 1; j <= (N * 2) - (i * 2); j++) {
                sb.append(" ");
            }
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        for (int i = 1; i < N; i++) {
            for (int j = i; j < N; j++) {
                sb.append("*");
            }
            for (int j = 1; j <= i * 2; j++) {
                sb.append(" ");
            }
            for (int j = i; j < N; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}
