package src.baekjoon.bronze100.d;

import java.io.*;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/10039">
 * https://www.acmicpc.net/problem/10039
 * </a>
 */
public class BOJ_10039 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int score = parseInt(br.readLine());
            if (score < 40) {
                score = 40;
            }
            sum += score;
        }

        bw.write(sum / 5 + "");
        bw.flush();
        bw.close();
        br.close();
    }

}
