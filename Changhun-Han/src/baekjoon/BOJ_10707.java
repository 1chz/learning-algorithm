package baekjoon;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Math.min;

/**
 * @see <a href="https://www.acmicpc.net/problem/10707">
 * https://www.acmicpc.net/problem/10707
 * </a>
 */
public class BOJ_10707 {
    
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int P = sc.nextInt();
        
        int X = A * P;
        int Y = B;
        
        if (P > C) {
            Y += (P - C) * D;
        }
        
        System.out.println(min(X, Y));
        
        sc.close();
    }
    
}