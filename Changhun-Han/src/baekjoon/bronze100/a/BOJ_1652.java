package baekjoon.bronze100.a;

import java.io.*;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/1652">
 * https://www.acmicpc.net/problem/1652
 * </a>
 */
public class BOJ_1652 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = parseInt(br.readLine());
        char[][] room = new char[N][N];

        int x = 0;
        int y = 0;
        int xCount = 0;
        int yCount = 0;

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                room[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (room[i][j] == '.') {
                    xCount++;
                    if (j == N - 1) {
                        if (xCount >= 2) {
                            x++;
                        }
                        xCount = 0;
                    }
                }
                else if (room[i][j] == 'X') {
                    if (xCount >= 2) {
                        x++;
                    }
                    xCount = 0;
                }
                if (room[j][i] == '.') {
                    yCount++;
                    if (j == N - 1) {
                        if (yCount >= 2) {
                            y++;
                        }
                        yCount = 0;
                    }
                }
                else if (room[j][i] == 'X') {
                    if (yCount >= 2) {
                        y++;
                    }
                    yCount = 0;
                }
            }
        }

        bw.write(x + " " + y);
        bw.flush();
        bw.close();
        br.close();
    }

}