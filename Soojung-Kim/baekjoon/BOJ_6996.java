package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ_6996 {

    private static boolean solveAnagrams(String first, String second) {
        char[] charArray1 = first.toCharArray();
        char[] charArray2 = second.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            String str1 = scanner.next();
            String str2 = scanner.next();

            if (solveAnagrams(str1, str2)) {
                System.out.println(str1 + " & " + str2 + " are anagrams.");
            } else {
                System.out.println(str1 + " & " + str2 + " are NOT anagrams.");
            }
        }

    }
}
