package baekjoon;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/15700">
 * https://www.acmicpc.net/problem/15700
 * </a>
 */
public class BOJ_15700 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger N = new BigInteger(st.nextToken());
        BigInteger M = new BigInteger(st.nextToken());
        System.out.println((N.multiply(M)).divide(new BigInteger("2")));
        br.close();
    }
    
}