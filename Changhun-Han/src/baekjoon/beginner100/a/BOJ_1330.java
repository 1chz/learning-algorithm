package baekjoon.beginner100.a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Integer.parseInt;

/**
 * @see <a href="https://www.acmicpc.net/problem/1330">
 * https://www.acmicpc.net/problem/1330
 * </a>
 */
public class BOJ_1330 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = parseInt(st.nextToken());
        int B = parseInt(st.nextToken());
        
        if (A == B) {
            System.out.print("==");
        }
        else if (A < B) {
            System.out.print("<");
        }
        else {
            System.out.print(">");
        }
        br.close();
    }
    
}