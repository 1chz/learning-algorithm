package baekjoon.bronze100.e;

import java.io.*;

/**
 * @see <a href="https://www.acmicpc.net/problem/11721">
 * https://www.acmicpc.net/problem/11721
 * </a>
 */
public class BOJ_11721 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String s = br.readLine();
        
        for(int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            if(i % 10 == 9) {
                sb.append("\n");
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    
}