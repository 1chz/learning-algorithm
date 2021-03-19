package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/11943">
 * https://www.acmicpc.net/problem/11943
 * </a>
 */
public class BOJ_11943 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int A = parseInt(st1.nextToken());
        int B = parseInt(st1.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int C = parseInt(st2.nextToken());
        int D = parseInt(st2.nextToken());
        
        if (B + C > A + D) {
            System.out.println(A + D);
        }
        else {
            System.out.println(B + C);
        }
        
        br.close();
    }
    
}