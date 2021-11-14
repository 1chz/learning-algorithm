package src.baekjoon.bronze100.c;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

/**
 * @see <a href="https://www.acmicpc.net/problem/2960">
 * https://www.acmicpc.net/problem/2960
 * </a>
 */
public class BOJ_2960 {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = parseInt(st.nextToken());
        int K = parseInt(st.nextToken());

        boolean[] prime = new boolean[N + 1];

        for(int i = 2; i <= N; i++) {
            prime[i] = true;
        }

        int count = 0;

        Loop:
        for(int i = 2; i <= N; i++) {
            for(int j = i; j <= N; j += i) {
                if(!prime[j]) {
                    continue;
                }
                prime[j] = false;
                count++;
                if(count == K) {
                    bw.write(valueOf(j));
                    break Loop;
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

}
