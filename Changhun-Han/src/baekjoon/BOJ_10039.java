package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/10039">
 * https://www.acmicpc.net/problem/10039
 * </a>
 */
public class BOJ_10039 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            int score = parseInt(br.readLine().trim());
            if (score < 40) {
                score = 40;
            }
            sum += score;
        }
        System.out.println(sum / 5);
        br.close();
    }
    
}