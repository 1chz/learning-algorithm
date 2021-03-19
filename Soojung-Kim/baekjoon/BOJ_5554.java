package baekjoon;

import java.util.Scanner;

public class BOJ_5554 {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            sum += input.nextInt();
        }

        System.out.println(sum / 60);
        System.out.println(sum % 60);
    }
}
