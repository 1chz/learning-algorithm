package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/10430">
 * https://www.acmicpc.net/problem/10430
 * </a>
 */
public class BOJ_10430 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int A = parseInt(st.nextToken());
        int B = parseInt(st.nextToken());
        int C = parseInt(st.nextToken());
        
        System.out.println(( A + B ) % C);
        System.out.println(( ( A % C ) + ( B % C ) ) % C);
        System.out.println(A * B % C);
        System.out.println(( ( A % C ) * ( B % C ) ) % C);
        
        br.close();
    }
    
}