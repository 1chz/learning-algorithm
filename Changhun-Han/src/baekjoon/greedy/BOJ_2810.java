package src.baekjoon.greedy;

import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/2810">
 * https://www.acmicpc.net/problem/2810
 * </a>
 */
public class BOJ_2810 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = parseInt(br.readLine());
        String s = br.readLine();

        int L = 0;
        int cupHolder = 0;

        for (int i = 0; i < N; i++) {
            if (s.charAt(i) == 'S') {
                cupHolder++;
            } else {
                L++;
                if (L == 2) {
                    cupHolder++;
                    L = 0;
                }
            }
        }

        int ans = 2 + (cupHolder - 1) > N
                ?
                N : 2 + (cupHolder - 1);

        System.out.println(ans);
    }

}
