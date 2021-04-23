package baekjoon.bronze100.c;

import java.io.*;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/2753">
 * https://www.acmicpc.net/problem/2753
 * </a>
 */
public class BOJ_2753 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int year = parseInt(br.readLine());
        
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            bw.write("1");
        }
        else {
            bw.write("0");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
    
}