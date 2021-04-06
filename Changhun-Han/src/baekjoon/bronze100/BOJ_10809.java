package baekjoon.bronze100;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @see <a href="https://www.acmicpc.net/problem/10809">
 * https://www.acmicpc.net/problem/10809
 * </a>
 */
public class BOJ_10809 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();

        for (char c = 'a'; c <= 'z'; c++) {
            sb.append(s.indexOf(c) + " ");
        }

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
        br.close();
    }

}