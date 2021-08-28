package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Long.parseLong;

/**
 * @see <a href="https://www.acmicpc.net/problem/15964">
 * https://www.acmicpc.net/problem/15964
 * </a>
 */
public class BOJ_15964 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        long A = parseLong(st.nextToken());
        long B = parseLong(st.nextToken());
        
        if (A == B) {
            System.out.println(0);
            return;
        }
        
        System.out.println(( A + B ) * ( A - B ));
        
    }
    
}