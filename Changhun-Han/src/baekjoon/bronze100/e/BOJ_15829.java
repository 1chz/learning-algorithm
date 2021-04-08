package baekjoon.bronze100.e;

import java.io.*;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/15829">
 * https://www.acmicpc.net/problem/15829
 * </a>
 */
public class BOJ_15829 {

    private static final int R = 31;
    private static final int M = 1234567891;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = parseInt(br.readLine());
        String s = br.readLine();

        long result = 0L;

        for (int i = 0; i < s.length(); i++) {
            long temp = s.charAt(i) - 'a' + 1;
            for (int j = 0; j < i; j++) {
                temp = (temp * R) % M;
            }
            result = (result + temp) % M;
        }

        bw.write(result + "");
        bw.flush();
        bw.close();
        br.close();
    }

}