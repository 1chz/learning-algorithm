package src.baekjoon.bronze100.d;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/5086">
 * https://www.acmicpc.net/problem/5086
 * </a>
 */
public class BOJ_5086 {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = parseInt(st.nextToken());
            int B = parseInt(st.nextToken());

            if (A == 0 && B == 0) {
                break;
            }

            if (B % A == 0) {
                sb.append("factor\n");
            } else if (A % B == 0) {
                sb.append("multiple\n");
            } else {
                sb.append("neither\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}
