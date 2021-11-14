package src.baekjoon.bronze100.c;

import java.io.*;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

/**
 * @see <a href="https://www.acmicpc.net/problem/2839">
 * https://www.acmicpc.net/problem/2839
 * </a>
 */
public class BOJ_2839 {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = parseInt(br.readLine());

        if((N < 10) && (N == 1 || N == 2 || N == 4 || N == 7)) {
            bw.write(valueOf(-1));
        }

        else if(N % 5 == 0) {
            bw.write(valueOf(N / 5));
        }

        else if(N % 5 == 1 || N % 5 == 3) {
            bw.write(valueOf(N / 5 + 1));
        }

        else if(N % 5 == 2 || N % 5 == 4 || N % 5 == 7) {
            bw.write(valueOf(N / 5 + 2));
        }

        bw.flush();
        bw.close();
        br.close();
    }

}
