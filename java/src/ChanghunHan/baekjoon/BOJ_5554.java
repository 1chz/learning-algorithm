package ChanghunHan.baekjoon;

import java.util.Scanner;

/**
 * @see <a href="https://www.acmicpc.net/problem/5554">
 * https://www.acmicpc.net/problem/5554
 * </a>
 */
public class BOJ_5554 {
    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int record = 0;
        for (int i = 0; i < 4; i++) {
            record += scanner.nextInt();
        }
        int min = record / 60;
        int sec = record % 60;
        System.out.println(min);
        System.out.println(sec);
        scanner.close();
    }
    
}