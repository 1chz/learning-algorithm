package baekjoon.bronze100.c;

import java.io.*;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/2577">
 * https://www.acmicpc.net/problem/2577
 * </a>
 */
public class BOJ_2577 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String s = Integer
                .toString(parseInt(br.readLine()) * parseInt(br.readLine()) * parseInt(br.readLine()));

        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if ((s.charAt(j) - '0') == i) {
                    count++;
                }
            }
            sb
                    .append(count)
                    .append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}