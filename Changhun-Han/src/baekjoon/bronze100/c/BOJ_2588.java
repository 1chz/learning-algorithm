package baekjoon.bronze100.c;

import java.io.*;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/2588">
 * https://www.acmicpc.net/problem/2588
 * </a>
 */
public class BOJ_2588 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int A = parseInt(br.readLine());
        int B = parseInt(br.readLine());
        
        sb.append(A * (B % 10))
          .append("\n")
          .append(A * (B % 100 / 10))
          .append("\n")
          .append(A * (B / 100))
          .append("\n")
          .append(A * B);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    
}