package src.baekjoon.bronze100.a;

import java.io.*;
import java.util.Arrays;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/1159">
 * https://www.acmicpc.net/problem/1159
 * </a>
 */
public class BOJ_1159 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int N = parseInt(br.readLine());
        String[] strings = new String[N];
        
        String s = "";
        
        for(int i = 0; i < N; i++) {
            strings[i] = br.readLine();
        }
        
        for(int i = 0; i < N; i++) {
            int count = 0;
            for(int j = 0; j < N; j++) {
                if(strings[i].substring(0, 1).equals(strings[j].substring(0, 1))) {
                    count++;
                }
            }
            
            if(count > 4) {
                if(s.indexOf(strings[i].substring(0, 1)) == -1) {
                    s = s + strings[i].substring(0, 1);
                }
            }
        }
        
        if("".equals(s)) {
            bw.write("PREDAJA");
        }
        else {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            bw.write(new String(chars));
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
    
}
