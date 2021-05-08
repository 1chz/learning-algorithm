package baekjoon;

import java.util.Scanner;

public class BOJ_2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tmp = 1;
        for (int i = 0; i < 3; i++) {
            tmp *= scanner.nextInt();
        }

        int[] counts = new int[10];

        String input = String.valueOf(tmp);
        for (int i = 0; i < input.length(); i++) {
            counts[input.charAt(i) - '0']++; // char to int
        }

        for (int i = 0; i < counts.length; i++) {
            System.out.println(counts[i]);
        }
    }
}
