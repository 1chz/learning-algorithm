package baekjoon.bronze100.d;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/10219">
 * https://www.acmicpc.net/problem/10219
 * </a>
 */
public class BOJ_10219 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int N = parseInt(br.readLine());
        
        while(0 < N--) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = parseInt(st.nextToken());
            int W = parseInt(st.nextToken());
            char[][] map = new char[H][W];
            
            for(int i = 0; i < H; i++) {
                String s = br.readLine();
                for(int j = 0; j < W; j++) {
                    map[i][j] = s.charAt(j);
                }
            }
            
            for(int i = H - 1; i >= 0; i--) {
                for(int j = 0; j < W; j++) {
                    sb.append(map[i][j]);
                }
                sb.append("\n");
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    
}