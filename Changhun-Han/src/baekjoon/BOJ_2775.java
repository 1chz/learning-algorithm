package src.baekjoon;

import java.io.IOException;
import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/2775">
 * https://www.acmicpc.net/problem/2775
 * </a>
 */
public class BOJ_2775 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int k, n;
        int[][] d = new int[15][15];

        for (int i = 1; i < 15; i++) {
            d[0][i] = i;
        }
        for (int i = 1; i < 15; i++) {
            for (int j = 1; j < 15; j++) {
                d[i][j] = d[i - 1][j] + d[i][j - 1];
            }
        }

        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            k = sc.nextInt();
            n = sc.nextInt();
            System.out.println(d[k][n]);
        }

        sc.close();
    }

}
