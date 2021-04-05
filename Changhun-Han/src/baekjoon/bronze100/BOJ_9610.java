package baekjoon.bronze100;

import static java.lang.Integer.parseInt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/9610">
 * https://www.acmicpc.net/problem/9610
 * </a>
 */
public class BOJ_9610 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int Q1 = 0;
        int Q2 = 0;
        int Q3 = 0;
        int Q4 = 0;
        int AXIS = 0;

        int N = parseInt(br.readLine());

        while (0 < N--) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = parseInt(st.nextToken());
            int y = parseInt(st.nextToken());

            if (x == 0 || y == 0) {
                AXIS++;
            } else if (x > 0 && y > 0) {
                Q1++;
            } else if (x < 0 && y > 0) {
                Q2++;
            } else if (x < 0 && y < 0) {
                Q3++;
            } else if (x > 0 && y < 0) {
                Q4++;
            }
        }

        sb
                .append("Q1: " + Q1)
                .append("\n")
                .append("Q2: " + Q2)
                .append("\n")
                .append("Q3: " + Q3)
                .append("\n")
                .append("Q4: " + Q4)
                .append("\n")
                .append("AXIS: " + AXIS);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}