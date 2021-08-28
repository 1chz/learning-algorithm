package baekjoon.bronze100.a;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/1008">
 * https://www.acmicpc.net/problem/1008
 * </a>
 */
public class BOJ_1008 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = parseInt(st.nextToken());
        int B = parseInt(st.nextToken());

        bw.write(String.valueOf((double) A / B));
        bw.flush();
        bw.close();
        br.close();
    }

}