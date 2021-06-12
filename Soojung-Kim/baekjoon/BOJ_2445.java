package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_2445 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            for (int i1 = 1; i1 <= i; i1++) {
                sb.append("*");
            }
            for (int j = 1; j <= (n - i) * 2; j++) {
                sb.append(" ");
            }

            for (int i1 = 1; i1 <= i; i1++) {
                sb.append("*");
            }

            sb.append("\n");
        }

        for (int i = n - 1; i > 0; i--) {
            for (int i1 = 1; i1 <= i; i1++) {
                sb.append("*");
            }
            for (int j = 1; j <= (n - i) * 2; j++) {
                sb.append(" ");
            }

            for (int i1 = 1; i1 <= i; i1++) {
                sb.append("*");
            }

            sb.append("\n");
        }

        System.out.println(sb);

        br.close();
    }
}
