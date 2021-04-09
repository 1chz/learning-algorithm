package baekjoon;

import java.util.Scanner;

public class BOJ_10797 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < 5; i++) {

            if (scanner.nextInt() == n) {
                count++;
            }
        }

        System.out.println(count);
    }
}
