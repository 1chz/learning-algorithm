package baekjoon.bronze100.d;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/10163">
 * https://www.acmicpc.net/problem/10163
 * </a>
 */
public class BOJ_10163 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = parseInt(br.readLine());

        int[][] map = new int[101][101];

        for (int i = 1; i <= N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = parseInt(st.nextToken());
            int y = parseInt(st.nextToken());
            int width = parseInt(st.nextToken());
            int height = parseInt(st.nextToken());
            for (int j = x; j < x + width; j++) {
                for (int k = y; k < y + height; k++) {
                    map[j][k] = i;
                }
            }
        }

        for (int i = 1; i <= N; i++) {
            int area = 0;
            for (int j = 0; j < 101; j++) {
                for (int k = 0; k < 101; k++) {
                    if (map[j][k] == i) {
                        area++;
                    }
                }
            }
            if (area == 0) {
                sb.append(0 + "\n");
            } else {
                sb.append(area + "\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}