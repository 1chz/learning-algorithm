package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/1271">
 * https://www.acmicpc.net/problem/1271
 * </a>
 */
public class BOJ_1271 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger M = new BigInteger(st.nextToken());
        BigInteger N = new BigInteger(st.nextToken());
        System.out.println(M.divide(N));
        System.out.println(M.remainder(N));
        br.close();
    }
    
}