package baekjoon.bronze100.e;

import java.io.*;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

/**
 * @see <a href="https://www.acmicpc.net/problem/10870">
 * https://www.acmicpc.net/problem/10870
 * </a>
 */
public class BOJ_10870 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = parseInt(br.readLine()) + 1;
        
        int[] fibonacci = new int[N];
        
        for(int i = 0; i < N; i++) {
            if(i == 0) {
                fibonacci[0] = 0;
            }
            else if(i == 1) {
                fibonacci[1] = 1;
            }
            else {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }
        }
        
        bw.write(valueOf(fibonacci[N - 1]));
        bw.flush();
        bw.close();
        br.close();
    }
    
}