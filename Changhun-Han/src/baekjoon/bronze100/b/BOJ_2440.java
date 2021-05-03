package baekjoon.bronze100.b;

import java.io.*;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/2440">
 * https://www.acmicpc.net/problem/2440
 * </a>
 */
public class BOJ_2440 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int N = parseInt(br.readLine());
        
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N - i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    
}