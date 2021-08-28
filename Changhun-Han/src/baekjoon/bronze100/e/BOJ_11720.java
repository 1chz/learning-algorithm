package baekjoon.bronze100.e;

import java.io.*;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/11720">
 * https://www.acmicpc.net/problem/11720
 * </a>
 */
public class BOJ_11720 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = parseInt(br.readLine());
        String s = br.readLine();
        int result = 0;
        
        for(int i = 0; i < N; i++) {
            result += parseInt(s.substring(i, i + 1));
        }
        
        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }
    
}