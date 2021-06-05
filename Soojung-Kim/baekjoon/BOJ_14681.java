package baekjoon;

import java.util.Scanner;

public class BOJ_14681 {

    public static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x > 0) {
            if (y > 0) {
                System.out.println("1");
            } else {
                System.out.println("4");
            }
        } else if (y > 0) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }
    }
}
