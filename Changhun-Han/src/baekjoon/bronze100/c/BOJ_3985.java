package src.baekjoon.bronze100.c;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/3985">
 * https://www.acmicpc.net/problem/3985
 * </a>
 */
public class BOJ_3985 {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        boolean[] L = new boolean[parseInt(br.readLine())];
        int[] N = new int[parseInt(br.readLine())];

        int expected = 0;
        int temp1 = 0;

        for(int i = 0; i < N.length; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int start = parseInt(st.nextToken());
            int end = parseInt(st.nextToken());
            int point = end - start + 1;

            if(temp1 < point) {
                temp1 = point;
                expected = i + 1;
            }
            for(int j = start - 1; j <= end - 1; j++) {
                if(!L[j]) {
                    L[j] = true;
                    N[i]++;
                }
            }
        }

        int temp2 = N[0];
        int actual = 1;

        for(int i = 1; i < N.length; i++) {
            if(temp2 < N[i]) {
                temp2 = N[i];
                actual = i + 1;
            }
        }

        sb.append(expected + "\n")
          .append(actual);

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}
