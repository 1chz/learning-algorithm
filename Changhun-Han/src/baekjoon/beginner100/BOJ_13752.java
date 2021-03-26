package baekjoon.beginner100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/13752">
 * https://www.acmicpc.net/problem/13752
 * </a>
 */
public class BOJ_13752 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int testCase = parseInt(br.readLine());
        
        for (int i = 0; i < testCase; i++) {
            int loop = parseInt(br.readLine());
            for (int j = 0; j < loop; j++) {
                System.out.print("=");
            }
            System.out.println();
        }
        br.close();
    }
    
}