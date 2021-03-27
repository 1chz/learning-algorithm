package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/11654">
 * https://www.acmicpc.net/problem/11654 아스키 코드
 * </a>
 */
public class BOJ_11654 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        final int result = st.nextToken().charAt(0);
        System.out.println(result);

        br.close();
    }
}
