package baekjoon.bronze100;

import java.io.IOException;
import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/10951">
 * https://www.acmicpc.net/problem/10951
 * </a>
 */
public class BOJ_10951 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A + B);
        }

        sc.close();
    }

}



