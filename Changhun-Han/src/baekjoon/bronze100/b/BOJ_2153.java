package baekjoon.bronze100.b;

import java.io.*;

/**
 * @see <a href="https://www.acmicpc.net/problem/2153">
 * https://www.acmicpc.net/problem/2153
 * </a>
 */
public class BOJ_2153 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        char[] chars = br.readLine().toCharArray();
        
        int sum = 0;
        
        for(int i = 0; i < chars.length; i++) {
            if(Character.isLowerCase(chars[i])) {
                sum += chars[i] - 96;
            }
            else {
                sum += chars[i] - 64;
            }
        }
        
        if(sum == 1) {
            bw.write("It is a prime word.");
        }
        else {
            for(int i = 2; i <= sum; i++) {
                if(i == sum) {
                    bw.write("It is a prime word.");
                    break;
                }
                if(sum % i == 0) {
                    bw.write("It is not a prime word.");
                    break;
                }
            }
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
    
}