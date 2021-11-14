package src.baekjoon.beginner100.c;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/11282">
 * https://www.acmicpc.net/problem/11282
 * </a>
 */
public class BOJ_11282 {

    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int index = parseInt(br.readLine()) + 44031;
        System.out.println((char) index);
        br.close();
    }

}
