package baekjoon.bronze100;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.Math.max;
import static java.lang.String.valueOf;

/**
 * @see <a href="https://www.acmicpc.net/problem/2908">
 * https://www.acmicpc.net/problem/2908
 * </a>
 */
public class BOJ_2908 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        int B = parseInt(new StringBuilder(st.nextToken()).reverse().toString());
        
        bw.write(valueOf(max(A, B)));
        bw.flush();
        bw.close();
        br.close();
    }
    
}