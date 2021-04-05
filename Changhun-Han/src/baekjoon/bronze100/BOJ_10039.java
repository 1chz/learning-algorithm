package baekjoon.bronze100;

import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

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