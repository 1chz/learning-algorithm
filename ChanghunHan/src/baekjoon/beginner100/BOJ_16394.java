package baekjoon.beginner100;

import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/16394">
 * https://www.acmicpc.net/problem/16394
 * </a>
 */
public class BOJ_16394 {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int schoolFoundationYear = 1946;
        int year = scanner.nextInt();
        int result = year - schoolFoundationYear;
        System.out.println(result);
        scanner.close();
    }
    
}