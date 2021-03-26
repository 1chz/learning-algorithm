package baekjoon.beginner100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * @see <a href="https://www.acmicpc.net/problem/14264">
 * https://www.acmicpc.net/problem/14264
 * </a>
 */
public class BOJ_14264 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double c = parseInt(br.readLine());
        double b = c / 2;
        double a = sqrt(pow(c, 2) - pow(b, 2));
        System.out.println(( a * 2 * b ) / 2);
        br.close();
    }
    
}