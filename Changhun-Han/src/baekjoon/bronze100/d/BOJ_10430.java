package src.baekjoon.bronze100.d;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/10430">
 * https://www.acmicpc.net/problem/10430
 * </a>
 */
public class BOJ_10430 {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = parseInt(st.nextToken());
        int B = parseInt(st.nextToken());
        int C = parseInt(st.nextToken());

        sb
                .append((A + B) % C)
                .append("\n")
                .append(((A % C) + (B % C)) % C)
                .append("\n")
                .append(A * B % C)
                .append("\n")
                .append(((A % C) * (B % C)) % C);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}
