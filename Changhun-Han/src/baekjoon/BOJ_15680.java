package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/15680">
 * https://www.acmicpc.net/problem/15680
 * </a>
 */
public class BOJ_15680 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = parseInt(br.readLine());
        if (N == 0) {
            System.out.print("YONSEI");
        }
        else {
            System.out.print("Leading the Way to the Future");
        }
        br.close();
    }
    
}