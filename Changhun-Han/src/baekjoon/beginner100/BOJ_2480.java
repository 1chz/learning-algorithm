package baekjoon.beginner100;

import java.io.IOException;
import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/2480">
 * https://www.acmicpc.net/problem/2480
 * </a>
 */
public class BOJ_2480 {
    
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] dice = new int[3];
        for (int i = 0; i < 3; i++) {
            dice[i] = sc.nextInt();
        }
        if (dice[0] == dice[1] && dice[0] == dice[2] && dice[1] == dice[2]) {
            System.out.print(10000 + dice[0] * 1000);
        }
        else if (dice[0] == dice[1]) {
            System.out.print(1000 + dice[0] * 100);
        }
        else if (dice[1] == dice[2]) {
            System.out.print(1000 + dice[1] * 100);
        }
        else if (dice[2] == dice[0]) {
            System.out.print(1000 + dice[2] * 100);
        }
        else {
            System.out.print(Math.max(Math.max(dice[0], dice[1]), dice[2]) * 100);
        }
        sc.close();
    }
    
}