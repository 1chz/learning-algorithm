package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/10998">
 * https://www.acmicpc.net/problem/10998 A×B
 * </a>
 */
public class BOJ_10998 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        final int result = Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        System.out.println(result);

        br.close();
    }
}
