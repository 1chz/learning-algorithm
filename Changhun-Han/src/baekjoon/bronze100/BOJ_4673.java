package baekjoon.bronze100;

import java.io.*;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

/**
 * @see <a href="https://www.acmicpc.net/problem/4673">
 * https://www.acmicpc.net/problem/4673
 * </a>
 */
public class BOJ_4673 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        boolean[] flag = new boolean[10001];
        for(int i = 1; i < 10001; i++) {
            int n = d(i);
            if(n < 10001) {
                flag[n] = true;
            }
        }
        
        for(int i = 1; i < 10001; i++) {
            if(!flag[i]) {
                sb.append(i + "\n");
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    
    public static int d (int n) {
        int sum = n;
        String s = Integer.toString(n);
        for(int i = 0; i < s.length(); i++) {
            sum += parseInt(valueOf(s.charAt(i)));
        }
        return sum;
    }
    
}