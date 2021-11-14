package src.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/3003">
 * https://www.acmicpc.net/problem/3003
 * </a>
 */
public class BOJ_3003 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] expected = { 1 - Integer.parseInt(st.nextToken()),
                           1 - Integer.parseInt(st.nextToken()),
                           2 - Integer.parseInt(st.nextToken()),
                           2 - Integer.parseInt(st.nextToken()),
                           2 - Integer.parseInt(st.nextToken()),
                           8 - Integer.parseInt(st.nextToken()) };
        
        for (int i = 0; i < expected.length; i++) {
            System.out.print(expected[i] + " ");
        }
        br.close();
    }
    
}
