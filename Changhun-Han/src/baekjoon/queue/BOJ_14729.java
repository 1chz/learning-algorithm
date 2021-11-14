package src.baekjoon.queue;

import java.io.*;
import java.util.Arrays;

import static java.lang.Float.parseFloat;
import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/14729">
 * https://www.acmicpc.net/problem/14729
 * </a>
 */
public class BOJ_14729 {

    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = parseInt(br.readLine());
        float[] list = new float[N];

        for(int i = 0; i < N; i++) {
            list[i] = parseFloat(br.readLine());
        }

        Arrays.sort(list);

        for(int i = 0; i < 7; i++) {
            bw.write(String.format("%.3f\n", list[i]));
        }

        bw.flush();
        bw.close();
        br.close();

    }

}
