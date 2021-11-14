package src.baekjoon.bronze100.a;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

/**
 * @see <a href="https://www.acmicpc.net/problem/1312">
 * https://www.acmicpc.net/problem/1312
 * </a>
 */
public class BOJ_1312 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = parseInt(st.nextToken());
        int B = parseInt(st.nextToken());
        int N = parseInt(st.nextToken());
        int result = A % B;

        for (int i = 0; i < N - 1; i++) {
            result *= 10;
            result %= B;
        }

        result *= 10;

        bw.write(valueOf(result / B));
        bw.flush();
        bw.close();
        br.close();
    }

}
