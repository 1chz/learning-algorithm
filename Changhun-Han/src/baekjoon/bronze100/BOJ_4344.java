package baekjoon.bronze100;

import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/4344">
 * https://www.acmicpc.net/problem/4344
 * </a>
 */
public class BOJ_4344 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = parseInt(br.readLine());

        while (0 < N--) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] scores = new int[parseInt(st.nextToken())];

            for (int i = 0; i < scores.length; i++) {
                scores[i] = parseInt(st.nextToken());
            }

            double avg = Arrays.stream(scores)
                    .average()
                    .getAsDouble();

            double idiots = Arrays.stream(scores)
                    .filter(o -> o > avg)
                    .count();

            sb.append(String.format("%.3f%%\n", idiots / scores.length * 100));

        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}



