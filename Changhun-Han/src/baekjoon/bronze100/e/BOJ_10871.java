package src.baekjoon.bronze100.e;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/10871">
 * https://www.acmicpc.net/problem/10871
 * </a>
 */
public class BOJ_10871 {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = parseInt(st.nextToken());
        int X = parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        while (0 < N--) {
            int num = parseInt(st.nextToken());
            if (num < X) {
                sb.append(num + " ");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}
