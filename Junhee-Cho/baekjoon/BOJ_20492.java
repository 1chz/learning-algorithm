package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/20492">
 * https://www.acmicpc.net/problem/20492 세금
 * </a>
 */
public class BOJ_20492 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int prize = Integer.parseInt(br.readLine());

        double taxRatio = 0.22;
        double expenses = 1 - 0.8;
        final double tax1 = prize * taxRatio;
        final double tax2 = prize * expenses * taxRatio;

        final int result1 = (int)(prize - tax1);
        final int result2 = (int)(prize - tax2);

        System.out.println(result1 + " " + result2);

        br.close();
    }
}
