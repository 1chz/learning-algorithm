package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/14652">
 * https://www.acmicpc.net/problem/14652 나는 행복합니다~
 * </a>
 */
public class BOJ_14652 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        final int n = Integer.parseInt(st.nextToken());
        final int m = Integer.parseInt(st.nextToken());
        final int k = Integer.parseInt(st.nextToken());

        final int result1 = k / m;
        final int result2 = k % m;

        System.out.println(result1 + " " + result2);
        br.close();
    }
}
