package baekjoon.beginner100.e;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/17356">
 * https://www.acmicpc.net/problem/17356
 * </a>
 */
public class BOJ_17356 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = parseInt(st.nextToken());
        int B = parseInt(st.nextToken());
        double M = (double) ( B - A ) / 400;
        System.out.println(1 / ( 1 + Math.pow(10, M) ));
        br.close();
    }
    
}