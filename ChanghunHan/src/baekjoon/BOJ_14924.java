package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/14924">
 * https://www.acmicpc.net/problem/14924
 * </a>
 */
public class BOJ_14924 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        System.out.println(T * (D / (S * 2)));
        br.close();
    }
    
}