package baekjoon.bronze100;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.util.Arrays.stream;

/**
 * @see <a href="https://www.acmicpc.net/problem/10813">
 * https://www.acmicpc.net/problem/10813
 * </a>
 */
public class BOJ_10813 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        st = new StringTokenizer(br.readLine());
        int N = parseInt(st.nextToken());
        int M = parseInt(st.nextToken());
        
        int[] list = new int[N];
        
        for(int i = 0; i < N; i++) {
            list[i] = i + 1;
        }
        while(0 < M--) {
            st = new StringTokenizer(br.readLine());
            int n1 = parseInt(st.nextToken()) - 1;
            int n2 = parseInt(st.nextToken()) - 1;
            int temp = list[n1];
            list[n1] = list[n2];
            list[n2] = temp;
        }
        
        stream(list)
                .forEach(o -> sb.append(o + " "));
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    
}