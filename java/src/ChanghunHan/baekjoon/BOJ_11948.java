package ChanghunHan.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/11948">
 * https://www.acmicpc.net/problem/11948
 * </a>
 */
public class BOJ_11948 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalScore = 0;
        int trigger = 101;
        for (int i = 0; i < 6; i++) {
            int score = parseInt(br.readLine());
            trigger = trigger < score ? trigger : score;
            totalScore += score;
            if (i == 3) {
                totalScore -= trigger;
                trigger = 101;
            }
            if (i == 5) {
                totalScore -= trigger;
            }
        }
        System.out.println(totalScore);
        br.close();
    }
    
}