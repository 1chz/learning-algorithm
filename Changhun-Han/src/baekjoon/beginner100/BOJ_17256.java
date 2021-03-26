package baekjoon.beginner100;

import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/17256">
 * https://www.acmicpc.net/problem/17256
 * </a>
 */
public class BOJ_17256 {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] a = { scanner.nextInt(),
                    scanner.nextInt(),
                    scanner.nextInt() };
        
        int[] c = { scanner.nextInt(),
                    scanner.nextInt(),
                    scanner.nextInt() };
        
        int[] b = { c[0] - a[2],
                    c[1] / a[1],
                    c[2] - a[0] };
        
        System.out.printf("%s %s %s", b[0], b[1], b[2]);
        scanner.close();
    }
    
}