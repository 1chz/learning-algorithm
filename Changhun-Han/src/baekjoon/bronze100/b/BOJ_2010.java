package baekjoon.bronze100.b;

import java.io.*;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/2010">
 * https://www.acmicpc.net/problem/2010
 * </a>
 */
public class BOJ_2010 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < N; i++) {
            int powerStrip = parseInt(br.readLine());
            result += powerStrip - 1;
        }

        result++;

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }

}