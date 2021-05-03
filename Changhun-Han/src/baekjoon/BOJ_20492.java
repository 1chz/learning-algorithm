package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/20492">
 * https://www.acmicpc.net/problem/20492
 * </a>
 */
public class BOJ_20492 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = parseInt(br.readLine());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((int) ( N * 0.78 ))
                     .append(" ")
                     .append((int) ( N * 0.956 ));
        System.out.println(stringBuilder);
        br.close();
    }
    
}