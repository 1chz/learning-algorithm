package src.baekjoon.bronze100.e;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/18883">
 * https://www.acmicpc.net/problem/18883
 * </a>
 */
public class BOJ_18883 {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = parseInt(st.nextToken());
        int M = parseInt(st.nextToken());
        int end = N * M;

        for (int i = 1; i <= end; i++) {
            if (i % M == 0) {
                sb.append(i + "\n");
            } else {
                sb.append(i + " ");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}
