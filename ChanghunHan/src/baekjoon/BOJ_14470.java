package baekjoon;

import java.io.*;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/14470">
 * https://www.acmicpc.net/problem/14470
 * </a>
 */
public class BOJ_14470 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = parseInt(br.readLine());
        int B = parseInt(br.readLine());
        int C = parseInt(br.readLine());
        int D = parseInt(br.readLine());
        int E = parseInt(br.readLine());
        
        boolean isNotFrozen = A > 0;
        
        if (isNotFrozen) {
            System.out.println(( B - A ) * E);
        }
        else {
            System.out.println(Math.abs(A) * C + D + ( B * E ));
        }
        
        br.close();
    }
    
}