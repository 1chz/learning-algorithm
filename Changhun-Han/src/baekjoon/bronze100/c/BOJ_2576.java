package src.baekjoon.bronze100.c;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/2576">
 * https://www.acmicpc.net/problem/2576
 * </a>
 */
public class BOJ_2576 {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            int num = parseInt(br.readLine());
            if (num % 2 == 1) {
                list.add(num);
            }
        }

        if (list.isEmpty()) {
            sb
                    .append("-1");
        } else {
            sb
                    .append(list.stream()
                            .reduce(0, Integer::sum))

                    .append("\n")

                    .append(list.stream()
                            .min(Integer::compare)
                            .orElse(-1));
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}
