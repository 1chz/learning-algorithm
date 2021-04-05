package baekjoon.bronze100;

import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

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