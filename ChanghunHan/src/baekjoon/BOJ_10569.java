package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/10569">
 * https://www.acmicpc.net/problem/10569
 * </a>
 */
public class BOJ_10569 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int V = 0;
        int E = 0;
        
        int T = parseInt(( br.readLine() ));
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            V = parseInt(st.nextToken());
            E = parseInt(st.nextToken());
            System.out.println(2 - V + E);
        }
        br.close();
    }
    
}