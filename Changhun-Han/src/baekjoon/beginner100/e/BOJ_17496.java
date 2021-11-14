package src.baekjoon.beginner100.e;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/17496">
 * https://www.acmicpc.net/problem/17496
 * </a>
 */
public class BOJ_17496 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = parseInt(st.nextToken());
        int T = parseInt(st.nextToken());
        int C = parseInt(st.nextToken());
        int P = parseInt(st.nextToken());
        if (( N % T ) == 0) {
            System.out.println(( ( N / T ) * C * P ) - ( C * P ));
        }
        else {
            System.out.println(( N / T ) * C * P);
        }
        br.close();
    }
    
}
