package src.baekjoon.bronze100.d;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/10250">
 * https://www.acmicpc.net/problem/10250
 * </a>
 */
public class BOJ_10250 {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int T = parseInt(br.readLine());

        while(0 < T--) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = parseInt(st.nextToken());
            int W = parseInt(st.nextToken());
            int N = parseInt(st.nextToken());

            if(N % H == 0) {
                sb.append((H * 100) + (N / H)).append('\n');
            }
            else {
                sb.append(((N % H) * 100) + ((N / H) + 1)).append('\n');
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}
