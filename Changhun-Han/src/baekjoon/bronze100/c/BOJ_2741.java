package src.baekjoon.bronze100.c;

import java.io.*;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/2741">
 * https://www.acmicpc.net/problem/2741
 * </a>
 */
public class BOJ_2741 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            sb
                    .append(i)
                    .append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}
