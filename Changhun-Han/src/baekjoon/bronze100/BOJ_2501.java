package baekjoon.bronze100;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

/**
 * @see <a href="https://www.acmicpc.net/problem/2501">
 * https://www.acmicpc.net/problem/2501
 * </a>
 */
public class BOJ_2501 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = parseInt(st.nextToken());
        int K = parseInt(st.nextToken());
        
        for(int i = 1; i <= N; i++) {
            if(N % i == 0) {
                K--;
                if(K == 0) {
                    bw.write(valueOf(i));
                    bw.flush();
                    bw.close();
                    br.close();
                    return;
                }
            }
        }
        
        bw.write("0");
        bw.flush();
        bw.close();
        br.close();
    }
    
}



