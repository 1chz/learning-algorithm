package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/15727">
 * https://www.acmicpc.net/problem/15727 조별과제를 하려는데 조장이 사라졌다
 * </a>
 */
public class BOJ_15727 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int distance = Integer.parseInt(br.readLine());
        System.out.println((distance - 1) / 5 + 1);
        br.close();
    }
}
