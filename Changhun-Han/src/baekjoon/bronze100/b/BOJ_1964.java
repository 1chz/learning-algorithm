package src.baekjoon.bronze100.b;

import java.io.*;
import java.math.BigInteger;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/1964">
 * https://www.acmicpc.net/problem/1964
 * </a>
 */
public class BOJ_1964 {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long N = parseInt(br.readLine());
        BigInteger num = new BigInteger(String.valueOf(1 + 4 * N + 3 * N * (N - 1) / 2));

        bw.write(num.remainder(new BigInteger("45678")).toString());
        bw.flush();
        bw.close();
        br.close();
    }

}
