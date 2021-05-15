package baekjoon.greedy;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @see <a href="https://www.acmicpc.net/problem/5585">
 * https://www.acmicpc.net/problem/5585
 * </a>
 */
public class BOJ_5585 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int money = 1000 - parseInt(br.readLine());

        int result = 0;

        while (money != 0) {
            if (money >= 500) {
                result += money / 500;
                money %= 500;
            } else if (money >= 100) {
                result += money / 100;
                money %= 100;
            } else if (money >= 50) {
                result += money / 50;
                money %= 50;
            } else if (money >= 10) {
                result += money / 10;
                money %= 10;
            } else if (money >= 5) {
                result += money / 5;
                money %= 5;
            } else {
                result += money;
                money = 0;
            }
        }

        bw.write(valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }
}