package baekjoon.beginner100.e;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Math.abs;

/**
 * @see <a href="https://www.acmicpc.net/problem/16431">
 * https://www.acmicpc.net/problem/16431
 * </a>
 */
public class BOJ_16431 {
    
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] b = { sc.nextInt(), sc.nextInt() };
        int[] d = { sc.nextInt(), sc.nextInt() };
        int[] j = { sc.nextInt(), sc.nextInt() };
        
        int bTime = Math.max(abs(b[0] - j[0]), abs(b[1] - j[1]));
        int dTime = abs(d[0] - j[0]) + abs(d[1] - j[1]);
        
        if (bTime == dTime) {
            System.out.println("tie");
        }
        else if (bTime > dTime) {
            System.out.println("daisy");
        }
        else {
            System.out.println("bessie");
        }
        
        sc.close();
    }
    
}