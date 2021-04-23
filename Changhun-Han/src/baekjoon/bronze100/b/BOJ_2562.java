package baekjoon.bronze100.b;

import java.io.*;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/2562">
 * https://www.acmicpc.net/problem/2562
 * </a>
 */
public class BOJ_2562 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int[] list = new int[9];
        int max = 0;
        int count = 0;
        
        for(int i = 0; i < list.length; i++) {
            list[i] = parseInt(br.readLine());
        }
        
        for(int i = 0; i < list.length; i++) {
            if(list[i] > max) {
                max = list[i];
                count = i + 1;
            }
        }
        
        sb.append(max + "\n")
          .append(count);
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    
}