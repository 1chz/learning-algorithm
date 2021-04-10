package baekjoon.bronze100.b;

import java.io.*;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/2439">
 * https://www.acmicpc.net/problem/2439
 * </a>
 */
public class BOJ_2439 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = parseInt(br.readLine());

        for (int i = 1; i <= N; ++i) {
            for (int j = 1; j <= N - i; ++j) {
                sb.append(" ");
            }
            for (int x = 1; x <= i; ++x) {
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