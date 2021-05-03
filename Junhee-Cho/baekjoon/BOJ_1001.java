package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/1001">
 * https://www.acmicpc.net/problem/1001 A-B
 * </a>
 */
public class BOJ_1001 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        final int first = Integer.parseInt(st.nextToken());
        final int second = Integer.parseInt(st.nextToken());
        final int result = first - second;
        System.out.println(result);

        br.close();
    }
}
