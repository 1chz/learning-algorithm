package baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class BOJ_10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        StringTokenizer st = new StringTokenizer(str, " ");
        int n = Integer.parseInt(st.nextToken());
        int greaterThen = Integer.parseInt(st.nextToken());

        String str2 = scanner.nextLine();
        st = new StringTokenizer(str2, " ");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            if (greaterThen > tmp) {
                sb.append(tmp);
                sb.append(" ");
            }
        }

        System.out.println(sb);
    }
}
