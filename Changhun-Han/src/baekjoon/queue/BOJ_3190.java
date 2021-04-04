package baekjoon.queue;

import java.io.*;
import java.util.LinkedList;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/3190">
 * https://www.acmicpc.net/problem/3190
 * </a>
 */
public class BOJ_3190 {
    
    static LinkedList<int[]> snake = new LinkedList<>();
    static boolean[][] board;
    
    public static void main (String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = parseInt(br.readLine());
        int K = parseInt(br.readLine());
        
        board = new boolean[N][N];
        
        for(int i = 0; i < K; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int row = parseInt(st.nextToken()) - 1;
            int col = parseInt(st.nextToken()) - 1;
            board[row][col] = true;
        }
        
        int L = parseInt(br.readLine());
        for(int i = 0; i < L; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sec = parseInt(st.nextToken());
            String dir = st.nextToken();
            run(sec, dir);
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
    
    private static void run (int sec, String dir) {
    
    }
    
}