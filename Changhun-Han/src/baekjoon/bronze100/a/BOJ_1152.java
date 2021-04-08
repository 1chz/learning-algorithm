package baekjoon.bronze100.a;

import java.io.*;

/**
 * @see <a href="https://www.acmicpc.net/problem/1152">
 * https://www.acmicpc.net/problem/1152
 * </a>
 */
public class BOJ_1152 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int result = 0;
        String s = br.readLine().trim();
        
        if("".equals(s)) {
            result = 0;
        }
        else {
            result = s.split(" ").length;
        }
        
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
    
}