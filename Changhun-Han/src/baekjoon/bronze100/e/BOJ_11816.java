package baekjoon.bronze100.e;

import java.io.*;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

/**
 * @see <a href="https://www.acmicpc.net/problem/11816">
 * https://www.acmicpc.net/problem/11816"
 * </a>
 */
public class BOJ_11816 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String s = br.readLine();
        
        if("0x".equals(s.substring(0, 2))) {
            bw.write(valueOf(parseInt(s.substring(2), 16)));
        }
        else if("0".equals(s.substring(0, 1))) {
            bw.write(valueOf(parseInt(s.substring(1), 8)));
        }
        else {
            bw.write(s);
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
    
}

