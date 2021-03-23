package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/17362">
 * https://www.acmicpc.net/problem/17362
 * </a>
 */
public class BOJ_17362 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = parseInt(br.readLine());
        
        if (1 <= N % 8 && N % 8 <= 5) {
            System.out.println(N % 8);
        }
        else if (N % 8 == 6) {
            System.out.println(4);
        }
        else if (N % 8 == 7) {
            System.out.println(3);
        }
        else if (N % 8 == 0) {
            System.out.println(2);
        }
        br.close();
    }
    
}