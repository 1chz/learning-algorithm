package src.baekjoon.bronze100.d;

import java.io.*;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/5543">
 * https://www.acmicpc.net/problem/5543
 * </a>
 */
public class BOJ_5543 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int burger = 2001;
        int drink = 2001;
        
        for(int i = 0; i < 3; i++) {
            int value = parseInt(br.readLine());
            if(value < burger) {
                burger = value;
            }
        }
        
        for(int i = 0; i < 2; i++) {
            int value = parseInt(br.readLine());
            if(value < drink) {
                drink = value;
            }
        }
        
        bw.write(String.valueOf(burger + drink - 50));
        bw.flush();
        bw.close();
        br.close();
    }
    
}
