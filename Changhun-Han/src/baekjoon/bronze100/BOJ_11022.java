package baekjoon.bronze100;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/11022">
 * https://www.acmicpc.net/problem/11022
 * </a>
 */
public class BOJ_11022 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int TC = parseInt(br.readLine());
        
        for(int i = 1; i <= TC; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = parseInt(st.nextToken());
            int B = parseInt(st.nextToken());
            int SUM = A + B;
            sb.append("Case #" + i + ": " + A + " + " + B + " = " + SUM + "\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    
}



