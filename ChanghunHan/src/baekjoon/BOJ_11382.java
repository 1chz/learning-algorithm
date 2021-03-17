package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/11382">
 * https//www.acmicpc.net/problem/11382
 * </a>
 */
public class BOJ_11382 {
    
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println(
                Long.parseLong(st.nextToken())
                +
                Long.parseLong(st.nextToken())
                +
                Long.parseLong(st.nextToken())
                          );
        br.close();
    }
    
}