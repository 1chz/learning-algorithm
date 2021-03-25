package baekjoon.beginner100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Integer.parseInt;
import static java.util.Arrays.stream;

/**
 * @see <a href="https://www.acmicpc.net/problem/15921">
 * https://www.acmicpc.net/problem/15921
 * </a>
 */
public class BOJ_15921 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = parseInt(br.readLine());
        
        if (N == 0) {
            System.out.print("divide by zero");
            return;
        }
        
        int[] scores = stream(br.readLine().split(" "))
                .mapToInt(Integer :: parseInt)
                .toArray();
        double avg = stream(scores).average().getAsDouble();
        double expect = 0;
        
        for (int i = 0; i < N; i++) {
            expect += scores[i] * (1.0 / scores.length);
            if (expect <= 0) {
                System.out.print("divide by zero");
                return;
            }
        }
        
        double result = avg / expect;
        System.out.printf("%.2f", (double) Math.round(result));
        
        br.close();
    }
    
}