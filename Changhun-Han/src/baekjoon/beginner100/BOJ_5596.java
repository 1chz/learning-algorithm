package baekjoon.beginner100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/5596">
 * https://www.acmicpc.net/problem/5596
 * </a>
 */
public class BOJ_5596 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer minguk = new StringTokenizer(br.readLine());
        StringTokenizer manse = new StringTokenizer(br.readLine());
        int S = 0;
        int T = 0;
        for (int i = 0; i < 4; i++) {
            S += parseInt(minguk.nextToken());
            T += parseInt(manse.nextToken());
        }
        if (S == T) {
            System.out.println(S);
        }
        else {
            System.out.println(Math.max(S, T));
        }
        br.close();
    }
    
}