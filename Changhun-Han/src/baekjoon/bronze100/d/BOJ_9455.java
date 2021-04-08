package baekjoon.bronze100.d;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/9455">
 * https://www.acmicpc.net/problem/9455
 * </a>
 */
public class BOJ_9455 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int N = parseInt(br.readLine());
        
        StringTokenizer st;
        
        while(0 < N--) {
            st = new StringTokenizer(br.readLine());
            int m = parseInt(st.nextToken());
            int n = parseInt(st.nextToken());
            int[][] map = new int[m][n];
            
            int count = 0;
            
            for(int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < n; j++) {
                    map[i][j] = parseInt(st.nextToken());
                }
            }
            
            for(int i = 0; i < n; i++) {
                int box = 0;
                for(int j = m - 1; j >= 0; j--) {
                    if(map[j][i] == 1) {
                        if(j != m - 1) {
                            count += m - 1 - j - box;
                        }
                        box++;
                    }
                }
            }
            sb.append(count + "\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    
}