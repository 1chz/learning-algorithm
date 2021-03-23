package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @see <a href="https://www.acmicpc.net/problem/2475">
 * https://www.acmicpc.net/problem/2475 검증수
 * </a>
 */
public class BOJ_2475 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String DELIMITER = " ";

        String[] arr = br.readLine().split(DELIMITER);
        final double sum = Arrays.stream(arr)
                .map(Integer::parseInt)
                .map((num) -> Math.pow(num, 2))
                .reduce(0.0, Double::sum);

        final int result = (int)sum % 10;
        System.out.println(result);

        br.close();
    }
}
