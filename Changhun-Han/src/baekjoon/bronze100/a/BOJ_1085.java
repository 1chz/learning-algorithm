package src.baekjoon.bronze100.a;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.Math.min;
import static java.lang.String.valueOf;

/**
 * @see <a href="https://www.acmicpc.net/problem/1085">
 * https://www.acmicpc.net/problem/1085
 * </a>
 */
public class BOJ_1085 {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = parseInt(st.nextToken());
        int Y = parseInt(st.nextToken());
        int W = parseInt(st.nextToken());
        int H = parseInt(st.nextToken());

        bw.write(valueOf(min(min(X, W - X), min(Y, H - Y))));
        bw.flush();
        bw.close();
        br.close();
    }

}
