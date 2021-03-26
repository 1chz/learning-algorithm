package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/1550">
 * https://www.acmicpc.net/problem/1550 16진수
 * </a>
 */
public class BOJ_1550 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int decimal = Integer.parseInt(br.readLine(),16);

        System.out.println(decimal);
        br.close();
    }
}
