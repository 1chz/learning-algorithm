package baekjoon.bronze100;

import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * @see <a href="https://www.acmicpc.net/problem/2576">
 * https://www.acmicpc.net/problem/2576
 * </a>
 */
public class BOJ_2576 {

    public static void main(String[] args) throws IOException {
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