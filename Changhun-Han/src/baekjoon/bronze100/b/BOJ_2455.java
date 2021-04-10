package baekjoon.bronze100.b;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

/**
 * @see <a href="https://www.acmicpc.net/problem/2455">
 * https://www.acmicpc.net/problem/2455
 * </a>
 */
public class BOJ_2455 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int people = 0;
        int result = 0;

        for (int i = 0; i < 4; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            people -= parseInt(st.nextToken());
            people += parseInt(st.nextToken());
            if (people > result) {
                result = people;
            }
        }

        bw.write(valueOf(result));
        bw.flush();
        bw.close();
        br.close();
    }

}