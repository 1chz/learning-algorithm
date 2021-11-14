package src.baekjoon.beginner100.e;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/19944">
 * https://www.acmicpc.net/problem/19944
 * </a>
 */
public class BOJ_19944 {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = parseInt(st.nextToken());
        int M = parseInt(st.nextToken());

        if (M == 1 || M == 2) {
            System.out.println("NEWBIE!");
        }
        else if (M <= N && M != 1 && M != 2) {
            System.out.println("OLDBIE!");
        }
        else {
            System.out.println("TLE!");
        }

        br.close();
    }

}
