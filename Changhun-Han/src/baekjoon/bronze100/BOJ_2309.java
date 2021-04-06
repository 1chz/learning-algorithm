package baekjoon.bronze100;

import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

/**
 * @see <a href="https://www.acmicpc.net/problem/2309">
 * https://www.acmicpc.net/problem/2309
 * </a>
 */
public class BOJ_2309 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int[] list = new int[9];

        for (int i = 0; i < 9; i++) {
            int height = parseInt(br.readLine());
            list[i] = height;
        }

        Arrays.sort(list);
        int sum = Arrays.stream(list).sum();
        boolean trigger = false;

        for (int i = 0; i < 9; i++) {
            if (trigger) {
                break;
            }
            for (int j = 0; j < 9; j++) {
                if (i == j) {
                    continue;
                }
                if (sum - list[i] - list[j] == 100) {
                    list[i] = 0;
                    list[j] = 0;
                    trigger = true;
                    break;
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            if (list[i] != 0) {
                sb.append(list[i] + "\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}