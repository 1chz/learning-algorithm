package baekjoon.bronze100;

import java.io.*;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/1193">
 * https://www.acmicpc.net/problem/1193
 * </a>
 */
public class BOJ_1193 {
    
    private static int line = 0;
    private static int count = 0;
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int N = parseInt(br.readLine());
        
        findManyLines(N);
        
        int value = N - (line * (line + 1) / 2 - line);
        
        if(line % 2 == 0) {
            bw.write(value + "/" + ((line + 1) - value));
        }
        else if(line % 2 == 1) {
            bw.write((line + 1) - value + "/" + value);
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
    
    private static void findManyLines (int N) {
        while(true) {
            for(int i = 0; i < line + 1; i++) {
                count++;
            }
            line++;
            if(count >= N) {
                break;
            }
        }
    }
    
}