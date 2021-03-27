package baekjoon.beginner100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/3004">
 * https://www.acmicpc.net/problem/3004
 * </a>
 */
public class BOJ_3004 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = parseInt(br.readLine());
        System.out.println((N / 2 + 1) * ((N - N / 2) + 1));
        br.close();
    }
    
}