package src.baekjoon.bronze100.e;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/14696">
 * https://www.acmicpc.net/problem/14696
 * </a>
 */
public class BOJ_14696 {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = parseInt(br.readLine());

        StringTokenizer st;

        for(int round = 0; round < N; round++) {
            int[] A = new int[4];
            int[] B = new int[4];

            st = new StringTokenizer(br.readLine());
            int ACard = parseInt(st.nextToken());
            for(int i = 0; i < ACard; i++) {
                A[parseInt(st.nextToken()) - 1]++;
            }

            st = new StringTokenizer(br.readLine());
            int BCard = parseInt(st.nextToken());
            for(int i = 0; i < BCard; i++) {
                B[parseInt(st.nextToken()) - 1]++;
            }

            for(int i = 3; i >= 0; i--) {
                if(A[i] > B[i]) {
                    sb.append("A\n");
                    break;
                }
                else if(A[i] < B[i]) {
                    sb.append("B\n");
                    break;
                }
                else if(i == 0) {
                    sb.append("D\n");
                    break;
                }
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}
