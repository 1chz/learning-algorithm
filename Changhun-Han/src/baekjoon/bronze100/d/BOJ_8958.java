package src.baekjoon.bronze100.d;

import java.io.*;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/8958">
 * https://www.acmicpc.net/problem/8958
 * </a>
 */
public class BOJ_8958 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = parseInt(br.readLine());

        while (0 < N--) {
            String s = br.readLine();
            int count = 0;
            int result = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'O') {
                    result += ++count;
                } else {
                    count = 0;
                }
            }
            sb.append(result + "\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}



