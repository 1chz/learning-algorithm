package algorithm.BOJ;

import java.util.Scanner;

public class BOJ_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        String st = sc.next();
        int result = 0;

        for (; i > 0; i--) {
            result += st.charAt(i-1) - '0';
        }

        System.out.println(result);
    }
}
