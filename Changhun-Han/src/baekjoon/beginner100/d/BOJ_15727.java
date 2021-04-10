package baekjoon.beginner100.d;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/15727">
 * https//www.acmicpc.net/problem/15727
 * </a>
 */
public class BOJ_15727 {
    
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int range = parseInt(br.readLine());
        
        if (range % 5 == 0) {
            System.out.println(range / 5);
        }
        else {
            System.out.println(( range / 5 ) + 1);
        }
        br.close();
    }
    
}