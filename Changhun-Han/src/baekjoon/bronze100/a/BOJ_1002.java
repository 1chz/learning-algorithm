package src.baekjoon.bronze100.a;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

/**
 * @see <a href="https://www.acmicpc.net/problem/1002">
 * https://www.acmicpc.net/problem/1002
 * </a>
 */
public class BOJ_1002 {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = parseInt(br.readLine());

        while(0 < T--) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x1 = parseInt(st.nextToken());
            int y1 = parseInt(st.nextToken());
            int r1 = parseInt(st.nextToken());

            int x2 = parseInt(st.nextToken());
            int y2 = parseInt(st.nextToken());
            int r2 = parseInt(st.nextToken());

            sb.append(calc(x1, y1, r1, x2, y2, r2))
              .append('\n');
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    private static int calc (int x1, int y1, int r1,
                             int x2, int y2, int r2) {
        int distance = (int) (pow(x2 - x1, 2) + pow(y2 - y1, 2));

        if(x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        }
        else if(distance > pow(r1 + r2, 2)) {
            return 0;
        }
        else if(distance < pow(r2 - r1, 2)) {
            return 0;
        }
        else if(distance == pow(r2 - r1, 2)) {
            return 1;
        }
        else if(distance == pow(r1 + r2, 2)) {
            return 1;
        }
        else {
            return 2;
        }

    }

}
