package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/8393">
 * https://www.acmicpc.net/problem/8393 합
 * </a>
 */
public class BOJ_8393 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int value = Integer.parseInt(br.readLine());
        final double result = (value + 1) * (value / 2.0);

        System.out.println((int)result);
        br.close();
    }
}
