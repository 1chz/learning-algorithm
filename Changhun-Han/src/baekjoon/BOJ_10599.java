package src.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/10599">
 * https://www.acmicpc.net/problem/10599
 * </a>
 */
public class BOJ_10599 {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = parseInt(st.nextToken());
            int b = parseInt(st.nextToken());
            int c = parseInt(st.nextToken());
            int d = parseInt(st.nextToken());
            if (a == 0 && b == 0 && c == 0 & d == 0) {
                return;
            }
            System.out.println(Math.abs(c - b) + " " + Math.abs(d - a));
        }
    }

}
