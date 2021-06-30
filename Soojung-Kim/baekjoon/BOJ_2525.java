package baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int term = scanner.nextInt();

        int total = hour * 60 + min + term;

        int endHour = total / 60;
        int endmin = total % 60;


        System.out.println((endHour > 23 ? endHour - 24 : endHour) + " " + endmin);

    }
}
