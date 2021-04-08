package baekjoon.bronze100;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

/**
 * @see <a href="https://www.acmicpc.net/problem/2798">
 * https://www.acmicpc.net/problem/2798
 * </a>
 */
public class BOJ_2798 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int N = parseInt(st.nextToken());
        int M = parseInt(st.nextToken());
        
        int[] list = new int[N];
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            list[i] = parseInt(st.nextToken());
        }
        
        int result = 0;
        
        Loop:
        for(int i = 0; i < N - 2; i++) {
            if(list[i] > M) {
                continue;
            }
            for(int j = i + 1; j < N - 1; j++) {
                if(list[i] + list[j] > M) {
                    continue;
                }
                for(int k = j + 1; k < N; k++) {
                    int temp = list[i] + list[j] + list[k];
                    if(M == temp) {
                        result = temp;
                        break Loop;
                    }
                    if(result < temp && temp < M) {
                        result = temp;
                    }
                }
            }
        }
        
        bw.write(valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
    
}