package baekjoon.greedy;

import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.util.Arrays.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/20300">
 * https://www.acmicpc.net/problem/20300
 * </a>
 */
public class BOJ_20300 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            long[] lossMuscles = new long[N];
            for (int i = 0; i < lossMuscles.length; i++) {
                lossMuscles[i] = parseLong(st.nextToken());
            }

            sort(lossMuscles);

            long maximum = 0;
            if (N % 2 == 0) {
                for (int i = 0; i < N / 2; i++) {
                    maximum = Math.max(maximum, lossMuscles[i] + lossMuscles[N - 1 - i]);
                }
            }
            else {
                maximum = lossMuscles[N - 1];
                for (int i = 0; i < (N - 1) / 2; i++) {
                    maximum = Math.max(maximum, lossMuscles[i] + lossMuscles[N - 2 - i]);
                }
            }
            System.out.println(maximum);
        }
    }
}