package baekjoon.beginner100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/17388">
 * https://www.acmicpc.net/problem/17388
 * </a>
 */
public class BOJ_17388 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int S = parseInt(st.nextToken());
        int K = parseInt(st.nextToken());
        int H = parseInt(st.nextToken());
        int sum = S + K + H;
        
        if (sum >= 100) {
            System.out.print("OK");
            return;
        }
        
        int min;
        String answer;
        if (S < K) {
            min = S;
            answer = "Soongsil";
        }
        else {
            min = K;
            answer = "Korea";
        }
        
        if (H < min) {
            answer = "Hanyang";
        }
        System.out.print(answer);
        
        br.close();
    }
    
}