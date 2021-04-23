package baekjoon.bronze100.e;

import java.io.*;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

/**
 * @see <a href="https://www.acmicpc.net/problem/10872">
 * https://www.acmicpc.net/problem/10872
 * </a>
 */
public class BOJ_10872 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int sum = 1;
        
        int N = parseInt(br.readLine());
        
        while(0 != N) {
            sum *= N;
            N--;
        }
        
        bw.write(valueOf(sum));
        bw.flush();
        bw.close();
        br.close();
    }
    
}