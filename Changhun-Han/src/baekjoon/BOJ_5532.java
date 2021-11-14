package src.baekjoon;

import java.io.IOException;
import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/5532">
 * https://www.acmicpc.net/problem/5532
 * </a>
 */
public class BOJ_5532 {

    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();

        int guk = A % C == 0 ? A / C : A / C + 1;
        int math = B % D == 0 ? B / D : B / D + 1;
        int workingDay = Math.max(guk, math);

        System.out.println(L - workingDay);
        sc.close();
    }

}
