package baekjoon.bronze100.a;

import java.io.*;

/**
 * @see <a href="https://www.acmicpc.net/problem/1373">
 * https://www.acmicpc.net/problem/1373
 * </a>
 */
public class BOJ_1373 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String s = br.readLine();
        
        if(s.length() % 3 == 1) {
            sb.append(s.charAt(0));
        }
        if(s.length() % 3 == 2) {
            sb.append((s.charAt(0) - '0') * 2 + (s.charAt(1) - '0'));
        }
        for(int i = s.length() % 3; i < s.length(); i += 3) {
            sb.append((s.charAt(i) - '0') * 4 + (s.charAt(i + 1) - '0') * 2 + (s.charAt(i + 2) - '0'));
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    
}