package baekjoon.beginner100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/10156">
 * https://www.acmicpc.net/problem/10156
 * </a>
 */
public class BOJ_10156 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = parseInt(st.nextToken());
        int N = parseInt(st.nextToken());
        int M = parseInt(st.nextToken());
        if (K * N <= M) {
            System.out.println("0");
        }
        else {
            System.out.println(K * N - M);
        }
        br.close();
    }
    
}