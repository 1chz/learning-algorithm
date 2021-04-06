package baekjoon.bronze100;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

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