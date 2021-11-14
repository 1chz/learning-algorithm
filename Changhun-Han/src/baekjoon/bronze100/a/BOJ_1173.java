package src.baekjoon.bronze100.a;

import java.io.*;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.String.valueOf;

/**
 * @see <a href="https://www.acmicpc.net/problem/1173">
 * https://www.acmicpc.net/problem/1173
 * </a>
 */
public class BOJ_1173 {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = parseInt(st.nextToken());
        int m = parseInt(st.nextToken());
        int M = parseInt(st.nextToken());
        int T = parseInt(st.nextToken());
        int R = parseInt(st.nextToken());

        int exercise = 0;
        int time = 0;
        int X = m;

        if(X + T > M) {
            bw.write("-1");
            bw.flush();
            bw.close();
            br.close();
            return;
        }

        while(exercise != N) {
            if(X + T <= M) {
                X += T;
                time++;
                exercise++;
            }
            else {
                time++;
                X -= R;
                if(X < m) {
                    X = m;
                }
            }
        }

        bw.write(valueOf(time));
        bw.flush();
        bw.close();
        br.close();
    }

}
