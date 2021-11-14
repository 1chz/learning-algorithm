package src.baekjoon.bronze100.a;

import java.io.*;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

/**
 * @see <a href="https://www.acmicpc.net/problem/1110">
 * https://www.acmicpc.net/problem/1110
 * </a>
 */
public class BOJ_1110 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = parseInt(br.readLine());

        int num = N;
        int count = 0;

        do {
            num = num % 10 * 10 + (num / 10 + num % 10) % 10;
            count++;
        } while (N != num);

        bw.write(valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }

}
