package baekjoon.bronze100.b;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

/**
 * @see <a href="https://www.acmicpc.net/problem/1712">
 * https://www.acmicpc.net/problem/1712
 * </a>
 */
public class BOJ_1712 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = parseInt(st.nextToken());
        int B = parseInt(st.nextToken());
        int C = parseInt(st.nextToken());
        
        if(C <= B) {
            bw.write("-1");
        }
        else {
            bw.write(valueOf((A / (C - B)) + 1));
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
    
}