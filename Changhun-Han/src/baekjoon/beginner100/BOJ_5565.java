package baekjoon.beginner100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/5565">
 * https://www.acmicpc.net/problem/5565
 * </a>
 */
public class BOJ_5565 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int total = parseInt(br.readLine());
        for (int i = 0; i < 9; i++) {
            total -= parseInt(br.readLine());
        }
        
        System.out.println(total);
        br.close();
    }
    
}