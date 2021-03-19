package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @see <a href="httpstps://www.acmicpc.net/problem/14928">
 * https//www.acmicpc.net/problem/14928
 * </a>
 */
public class BOJ_14928 {
    
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            answer = ( ( answer * 10 ) + ( str.charAt(i) - '0' ) ) % 20000303;
        }
        System.out.println(answer);
        br.close();
    }
    
}