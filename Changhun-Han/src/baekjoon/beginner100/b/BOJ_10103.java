package baekjoon.beginner100.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/10103">
 * https://www.acmicpc.net/problem/10103
 * </a>
 */
public class BOJ_10103 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int A = 100;
        int B = 100;
        int N = parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int aScore = parseInt(st.nextToken());
            int bScore = parseInt(st.nextToken());
            if (aScore == bScore) {
                continue;
            }
            else if (aScore < bScore) {
                A -= bScore;
            }
            else {
                B -= aScore;
            }
        }
        System.out.println(A);
        System.out.println(B);
        br.close();
    }
    
}