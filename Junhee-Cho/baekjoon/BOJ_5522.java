package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/5522">
 * https://www.acmicpc.net/problem/5522
 * </a>
 */
public class BOJ_5522 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int GAME_COUNT = 5;
        int result = 0;
        for (int i=0; i < GAME_COUNT; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            result += Integer.parseInt(st.nextToken());
        }
        System.out.println(result);
        br.close();
    }
}
