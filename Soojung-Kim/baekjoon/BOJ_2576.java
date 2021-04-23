package baekjoon;

import java.util.Scanner;

public class BOJ_2576 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int min = -1;
        int sum = 0;
        for (int i = 0; i < 7; i++) {
            int tmp = scanner.nextInt();

            if (tmp % 2 == 1) {
                if (min == -1) {
                    min = tmp;
                }
                if (min > tmp) {
                    min = tmp;
                }
                sum += tmp;
            }
        }

        if (sum > 0) {
            System.out.println(sum);
        }
        System.out.println(min);
    }
}
