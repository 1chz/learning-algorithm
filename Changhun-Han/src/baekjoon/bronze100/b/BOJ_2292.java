package baekjoon.bronze100.b;

import java.io.*;

import static java.lang.String.valueOf;

/**
 * @see <a href="https://www.acmicpc.net/problem/2292">
 * https://www.acmicpc.net/problem/2292
 * </a>
 */
public class BOJ_2292 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int range = 2;
        
        if(N == 1) {
            bw.write("1");
        }
        
        else {
            while(range <= N) {
                range = range + (6 * count);
                count++;
            }
            bw.write(valueOf(count));
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
    
}