package src.baekjoon.bronze100.b;

import java.io.*;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

/**
 * @see <a href="https://www.acmicpc.net/problem/2231">
 * https://www.acmicpc.net/problem/2231
 * </a>
 */
public class BOJ_2231 {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();

        int result = 0;

        int N = parseInt(s);
        int len = s.length();

        for(int i = (N - (len * 9)); i < N; i++) {
            int num = i;
            int sum = 0;

            while(num != 0) {
                sum += num % 10;
                num /= 10;
            }

            if(sum + i == N) {
                result = i;
                break;
            }

        }

        bw.write(valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }

}
