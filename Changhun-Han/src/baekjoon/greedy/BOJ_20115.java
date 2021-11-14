package src.baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;
import static java.util.Arrays.stream;
import static java.util.Collections.reverseOrder;

/**
 * @see <a href="https://www.acmicpc.net/problem/20115">
 * https://www.acmicpc.net/problem/20115
 * </a>
 */
public class BOJ_20115 {

    public static void main(String[] args) throws IOException {
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            int N = parseInt(br.readLine());

            Double[] drinks = stream(br.readLine().split(" "))
                    .map(Double::parseDouble)
                    .sorted(reverseOrder())
                    .toArray(Double[]::new);

            double result = drinks[0];
            for(int i = 1; i < N; i++) {
                result += drinks[i] / 2;
            }

            System.out.print(result);

        }
    }

}
