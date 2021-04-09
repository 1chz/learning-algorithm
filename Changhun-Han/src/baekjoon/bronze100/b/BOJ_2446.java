package baekjoon.bronze100.b;

import java.io.*;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/2446">
 * https://www.acmicpc.net/problem/2446
 * </a>
 */
public class BOJ_2446 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int N = parseInt(br.readLine());
        
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < i; j++) {
                sb.append(" ");
            }
            for(int l = 0; l < (2 * N - 1) - (2 * i); l++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        
        for(int i = 0; i < N - 1; i++) {
            for(int j = 1; j < (N - 1) - i; j++) {
                sb.append(" ");
            }
            for(int l = 0; l < 3 + 2 * i; l++) {
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