package baekjoon.bronze100.a;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.Math.max;
import static java.lang.String.valueOf;

/**
 * @see <a href="https://www.acmicpc.net/problem/1236">
 * https://www.acmicpc.net/problem/1236
 * </a>
 */
public class BOJ_1236 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = parseInt(st.nextToken());
        int M = parseInt(st.nextToken());
        char[][] castle = new char[N][M];
        
        int X = 0;
        int Y = 0;
        
        for(int i = 0; i < N; i++) {
            String s = br.readLine();
            for(int j = 0; j < M; j++) {
                castle[i][j] = s.charAt(j);
            }
        }
        for(int i = 0; i < N; i++) {
            boolean guard = true;
            for(int j = 0; j < M; j++) {
                if(castle[i][j] == 'X') {
                    guard = false;
                    break;
                }
            }
            if(guard) {
                X++;
            }
        }
        for(int i = 0; i < M; i++) {
            boolean guard = true;
            for(int j = 0; j < N; j++) {
                if(castle[j][i] == 'X') {
                    guard = false;
                    break;
                }
            }
            if(guard) {
                Y++;
            }
        }
        
        bw.write(valueOf(max(X, Y)));
        bw.flush();
        bw.close();
        br.close();
    }
    
}