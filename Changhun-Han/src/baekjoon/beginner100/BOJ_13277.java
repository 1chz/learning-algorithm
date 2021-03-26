package baekjoon.beginner100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/13277">
 * https://www.acmicpc.net/problem/13277
 * </a>
 */
public class BOJ_13277 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println(new BigInteger(st.nextToken()).multiply(new BigInteger(st.nextToken())));
        br.close();
    }
    
}