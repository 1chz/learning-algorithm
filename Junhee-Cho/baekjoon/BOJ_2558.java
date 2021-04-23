package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/2558">
 * https://www.acmicpc.net/problem/2558 A+B - 2
 * </a>
 */
public class BOJ_2558 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int first =Integer.parseInt(br.readLine());
        int second =Integer.parseInt(br.readLine());
        System.out.println(first + second);

        br.close();
    }
}
