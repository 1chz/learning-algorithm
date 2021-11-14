package src.baekjoon.bronze100.e;

import java.io.*;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/14681">
 * https://www.acmicpc.net/problem/14681
 * </a>
 */
public class BOJ_14681 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int x = parseInt(br.readLine());
        int y = parseInt(br.readLine());
        
        if(x > 0 && y > 0) {
            bw.write("1");
        }
        else if(x < 0 && y > 0) {
            bw.write("2");
        }
        else if(x < 0 && y < 0) {
            bw.write("3");
        }
        else if(x > 0 && y < 0) {
            bw.write("4");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
    
}



