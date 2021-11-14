package src.baekjoon.beginner100.a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/2522">
 * https://www.acmicpc.net/problem/2522
 * </a>
 */
public class BOJ_2522 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = parseInt(st.nextToken());
        
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= N - ( N - i ); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        for (int i = 1; i <= N - 1; i++) {
            for (int j = 1; j <= N - ( N - i ); j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= N - i; j++) {
                System.out.print("*");
            }
            if (i < N - 1) {
                System.out.println();
            }
        }
        br.close();
    }
    
}
