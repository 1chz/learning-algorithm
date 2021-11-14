package src.baekjoon.bronze100.a;

import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

/**
 * @see <a href="https://www.acmicpc.net/problem/1546">
 * https://www.acmicpc.net/problem/1546
 * </a>
 */
public class BOJ_1546 {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = parseInt(br.readLine());

        int[] scores = Stream.of(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int max = Arrays.stream(scores)
                .max()
                .getAsInt();

        int sum = Arrays.stream(scores)
                .sum();

        double calculate = (double) max / 100;
        double avg = sum / calculate / N;

        bw.write(valueOf(avg));
        bw.flush();
        bw.close();
        br.close();
    }

}
