package baekjoon.beginner100.a;

import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/2475">
 * https://www.acmicpc.net/problem/2475
 * </a>
 */
public class BOJ_2475 {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        for (int index = 0; index < 5; index++) {
            total += Math.pow(scanner.nextDouble(), 2);
        }
        System.out.println((int) total % 10);
        scanner.close();
    }
    
}