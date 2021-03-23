package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/2914">
 * https://www.acmicpc.net/problem/2914 저작권
 * </a>
 */
public class BOJ_2914 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        final int first = Integer.parseInt(st.nextToken());
        final int second = Integer.parseInt(st.nextToken()) - 1;
        final int result = first * second + 1;
        System.out.println(result);

        br.close();
    }
}
