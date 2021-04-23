package baekjoon;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Math.min;

/**
 * @see <a href="https://www.acmicpc.net/problem/19698">
 * https://www.acmicpc.net/problem/19698
 * </a>
 */
public class BOJ_19698 {
    
    public static void main (String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        int H = sc.nextInt();
        int L = sc.nextInt();
        W /= L;
        H /= L;
        System.out.println(min(W * H, N));
    }
    
}