package baekjoon.bronze100.a;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/1009">
 * https://www.acmicpc.net/problem/1009
 * </a>
 */
public class BOJ_1009 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = parseInt(br.readLine());

        while (0 < N--) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int A = parseInt(st.nextToken());
            int B = parseInt(st.nextToken());
            int temp = 0;
            int result = 1;

            if (A % 10 == 0 || A % 10 == 1 || A % 10 == 5 || A % 10 == 6) {
                result = A % 10;
            } else if (A % 10 == 4 || A % 10 == 9) {
                temp = B % 2;
                if (temp == 0) {
                    temp = 2;
                }
            } else {
                temp = B % 4;
                if (temp == 0) {
                    temp = 4;
                }
            }

            for (int i = 0; i < temp; i++) {
                result = (result * A) % 10;
            }
            if (result == 0) {
                result = 10;
            }
            sb.append(result + "\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}