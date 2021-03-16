package ChanghunHan.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/8393">
 * https://www.acmicpc.net/problem/8393
 * </a>
 */
public class BOJ_8393 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = parseInt(br.readLine());
        System.out.println(N * ( N + 1 ) / 2);
        br.close();
    }
    
}