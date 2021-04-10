package baekjoon.bronze100.e;

import java.io.*;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/10996">
 * https://www.acmicpc.net/problem/10996
 * </a>
 */
public class BOJ_10996 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int N = parseInt(br.readLine());
        
        for(int i = 1; i <= N * 2; i++) {
            if(i % 2 == 1) {
                for(int j = 1; j <= N; j++) {
                    if(j % 2 == 1) {
                        sb.append("*");
                    }
                    else {
                        sb.append(" ");
                    }
                }
            }
            
            else {
                for(int j = 1; j <= N; j++) {
                    if(j % 2 == 1) {
                        sb.append(" ");
                    }
                    else {
                        sb.append("*");
                    }
                }
            }
            sb.append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    
}