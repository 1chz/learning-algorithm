package baekjoon;

import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/16430">
 * https://www.acmicpc.net/problem/16430
 * </a>
 */
public class BOJ_16430 {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        System.out.printf("%s %s", ( B - A ), B);
        scanner.close();
    }
    
}