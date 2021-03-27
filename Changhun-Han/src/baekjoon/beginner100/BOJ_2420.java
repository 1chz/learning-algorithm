package baekjoon.beginner100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/2420">
 * https://www.acmicpc.net/problem/2420
 * </a>
 */
public class BOJ_2420 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger N = new BigInteger(st.nextToken());
        BigInteger M = new BigInteger(st.nextToken());
        System.out.println(new BigInteger(String.valueOf(N.subtract(M))).abs());
        br.close();
    }
    
}