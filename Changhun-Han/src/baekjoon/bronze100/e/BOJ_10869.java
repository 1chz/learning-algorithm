package baekjoon.bronze100.e;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/10869">
 * https://www.acmicpc.net/problem/10869
 * </a>
 */
public class BOJ_10869 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = parseInt(st.nextToken());
        int B = parseInt(st.nextToken());

        sb
                .append(A + B + "\n")
                .append(A - B + "\n")
                .append(A * B + "\n")
                .append(A / B + "\n")
                .append(A % B);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}