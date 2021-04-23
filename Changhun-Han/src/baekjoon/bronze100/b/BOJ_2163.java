package baekjoon.bronze100.b;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

/**
 * @see <a href="https://www.acmicpc.net/problem/2163">
 * https://www.acmicpc.net/problem/2163
 * </a>
 */
public class BOJ_2163 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = parseInt(st.nextToken()) * parseInt(st.nextToken()) - 1;

        bw.write(valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }

}