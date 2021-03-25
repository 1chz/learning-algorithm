package baekjoon.beginner100;

import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/10998">
 * https://www.acmicpc.net/problem/10998
 * </a>
 */
public class BOJ_10998 {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.println(A * B);
        scanner.close();
    }
    
}