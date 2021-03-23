package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/11283">
 * https://www.acmicpc.net/problem/11283 한글 2
 * </a>
 */
public class BOJ_11283 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int FIRST_POINT = "가".codePointAt(0) - 1;
        final int codePoint = br.readLine().codePointAt(0) - FIRST_POINT;

        System.out.println(codePoint);
        br.close();
    }
}
