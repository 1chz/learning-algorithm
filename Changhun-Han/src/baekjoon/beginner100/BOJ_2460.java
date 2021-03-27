package baekjoon.beginner100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/2460">
 * https://www.acmicpc.net/problem/2460
 * </a>
 */
public class BOJ_2460 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max = 0;
        int passengers = 0;
        for (int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int M = parseInt(st.nextToken());
            int N = parseInt(st.nextToken());
            passengers -= M;
            passengers += N;
            if (passengers > max) {
                max = passengers;
            }
        }
        System.out.print(max);
        br.close();
    }
    
}