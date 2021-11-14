package src.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;

import static java.lang.Integer.parseInt;
import static java.util.Arrays.sort;

/**
 * @see <a href="https://www.acmicpc.net/problem/1758">
 * https://www.acmicpc.net/problem/1758
 * </a>
 */
public class BOJ_1758 {

    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = parseInt(br.readLine());
            Integer[] tips = new Integer[N];

            for(int i = 0; i < N; i++) {
                tips[i] = parseInt(br.readLine());
            }

            sort(tips, Collections.reverseOrder());

            long sum = 0;
            for(int i = 0; i < N; i++) {
                int tip = tips[i] - ((i + 1) - 1);
                if(tip <= 0) {
                    break;
                }
                sum += tip;
            }
            System.out.println(sum);
        }
    }

}
