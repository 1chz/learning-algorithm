package baekjoon.bronze100;

import java.io.*;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

/**
 * @see <a href="https://www.acmicpc.net/problem/1076">
 * https://www.acmicpc.net/problem/1076
 * </a>
 */
public class BOJ_1076 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String result = "";
        
        for(int i = 1; i <= 3; i++) {
            String s = br.readLine();
            int index = Color.valueOf(s).ordinal();
            
            if(i == 3) {
                sb.append(parseInt(result) * (long) pow(10, index));
            }
            else {
                result += Integer.toString(index);
            }
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
    
    private enum Color {
        black,
        brown,
        red,
        orange,
        yellow,
        green,
        blue,
        violet,
        grey,
        white
    }
    
}