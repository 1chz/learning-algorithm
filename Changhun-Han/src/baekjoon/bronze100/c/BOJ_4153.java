package src.baekjoon.bronze100.c;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/4153">
 * https://www.acmicpc.net/problem/4153
 * </a>
 */
public class BOJ_4153 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        while(true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int X = parseInt(st.nextToken());
            int Y = parseInt(st.nextToken());
            int Z = parseInt(st.nextToken());
            
            if(X == 0 && Y == 0 && Z == 0) {
                break;
            }
            
            if((X * X + Y * Y) == Z * Z) {
                sb.append("right")
                  .append('\n');
            }
            else if(X * X == (Y * Y + Z * Z)) {
                sb.append("right")
                  .append('\n');
            }
            else if(Y * Y == (Z * Z + X * X)) {
                sb.append("right")
                  .append('\n');
            }
            else {
                sb.append("wrong")
                  .append('\n');
            }
            
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    
}
