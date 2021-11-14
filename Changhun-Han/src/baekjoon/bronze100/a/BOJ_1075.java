package src.baekjoon.bronze100.a;

import java.io.*;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

/**
 * @see <a href="https://www.acmicpc.net/problem/1075">
 * https://www.acmicpc.net/problem/1075
 * </a>
 */
public class BOJ_1075 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = parseInt(br.readLine());
        int F = parseInt(br.readLine());
        
        int x = ((N - (N % 100)) / F) * F;
        int temp = 0;
        
        if(x % F == 0) {
            if(x < N - N % 100) {
                temp = x + F;
            }
            else {
                temp = x;
            }
        }
        
        String result = valueOf(temp)
                .substring(valueOf(temp).length() - 2);
        
        bw.write(result);
        bw.flush();
        bw.close();
        br.close();
    }
    
}
