package baekjoon.bronze100;

import java.io.*;

/**
 * @see <a href="https://www.acmicpc.net/problem/1100">
 * https://www.acmicpc.net/problem/1100
 * </a>
 */
public class BOJ_1100 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        char[][] board = new char[8][8];
        int piece = 0;
        
        for(int i = 0; i < board.length; i++) {
            String s = br.readLine();
            for(int j = 0; j < board.length; j++) {
                board[i][j] = s.charAt(j);
                if((i + j) % 2 == 0 && board[i][j] == 'F') {
                    piece++;
                }
            }
        }
        
        bw.write(piece + "");
        bw.flush();
        bw.close();
        br.close();
    }
    
}