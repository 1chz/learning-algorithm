package baekjoon.bronze100.a;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * @see <a href="https://www.acmicpc.net/problem/1157">
 * https://www.acmicpc.net/problem/1157
 * </a>
 */
public class BOJ_1157 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] chars = new int[26];
        int c = System.in.read();

        while (c > 64) {
            if (c < 91) {
                chars[c - 65]++;
            }
            else {
                chars[c - 97]++;
            }
            c = System.in.read();
        }

        int max = -1;
        int ch = -2;

        for (int i = 0; i < 26; i++) {
            if (chars[i] > max) {
                max = chars[i];
                ch = i;
            }
            else if (chars[i] == max) {
                ch = -2;
            }
        }
        bw.write((char) (ch + 65));
        bw.flush();
        bw.close();
    }

}