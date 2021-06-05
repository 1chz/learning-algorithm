package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class BOJ_10951 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt() + scanner.nextInt());
        }
    }
}
