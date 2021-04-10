package baekjoon.bronze100.c;

import java.io.*;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/2675">
 * https://www.acmicpc.net/problem/2675
 * </a>
 */
public class BOJ_2675 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int T = parseInt(br.readLine());
        
        for(int i = 0; i < T; i++) {
            String[] strings = br.readLine().split(" ");
            int R = parseInt(strings[0]);
            for(byte b : strings[1].getBytes()) {
                for(int j = 0; j < R; j++) {
                    sb.append((char) b);
                }
            }
            sb.append('\n');
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    
}