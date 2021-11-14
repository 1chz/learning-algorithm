package src.baekjoon;

import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/5522">
 * https://www.acmicpc.net/problem/5522
 * </a>
 */
public class BOJ_5522 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalScore = 0;
        for (int i = 0; i < 5; i++) {
            totalScore += scanner.nextInt();
        }
        System.out.println(totalScore);
        scanner.close();
    }

}
