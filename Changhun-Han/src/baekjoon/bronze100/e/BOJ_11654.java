package src.baekjoon.bronze100.e;

import java.io.*;

/**
 * @see <a href="https://www.acmicpc.net/problem/11654">
 * https://www.acmicpc.net/problem/11654
 * </a>
 */
public class BOJ_11654 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char c = br.readLine().charAt(0);

        bw.write((int) c + "");
        bw.flush();
        bw.close();
        br.close();
    }

}
