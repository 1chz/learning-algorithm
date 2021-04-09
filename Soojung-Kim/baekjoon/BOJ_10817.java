package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_10817 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] arr = input.split(" ");
        int[] numArr = Arrays.stream(Arrays.asList(arr).stream().mapToInt(Integer::parseInt).toArray()).sorted().toArray();
        System.out.print(numArr[1]);
    }
}
