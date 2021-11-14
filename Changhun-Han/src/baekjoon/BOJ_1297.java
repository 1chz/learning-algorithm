package src.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;
import static java.lang.Math.*;

/**
 * @see <a href="https://www.acmicpc.net/problem/1297">
 * https://www.acmicpc.net/problem/1297
 * </a>
 */
public class BOJ_1297 {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int diagonal = parseInt(st.nextToken());
        int height = parseInt(st.nextToken());
        int width = parseInt(st.nextToken());
        double diagonalRate = diagonal / sqrt(pow(width, 2) + pow(height, 2));
        System.out.printf("%d %d", (int) floor(height * diagonalRate), (int) floor(width * diagonalRate));
        br.close();
    }

}
