package baekjoon.bronze100.c;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.String.valueOf;

/**
 * @see <a href="https://www.acmicpc.net/problem/2869">
 * https://www.acmicpc.net/problem/2869
 * </a>
 */
public class BOJ_2869 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        
        int day = (V - B) / (A - B);
        if((V - B) % (A - B) != 0) {
            day++;
        }
        
        bw.write(valueOf(day));
        bw.flush();
        bw.close();
        br.close();
    }
    
}