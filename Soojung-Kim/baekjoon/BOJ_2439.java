package baekjoon;

import java.util.Scanner;

public class BOJ_2439 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n - i - 1; j++) {
                sb.append(" ");
            }

            for (int j = 0; j < i + 1; j++) {
                sb.append("*");
            }

            System.out.println(sb.toString());
        }
    }
}
