package src.baekjoon.beginner100.d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * @see <a href="https://www.acmicpc.net/problem/14623">
 * https://www.acmicpc.net/problem/14623
 * </a>
 */
public class BOJ_14623 {

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger B1 = new BigInteger(br.readLine(), 2);
        BigInteger B2 = new BigInteger(br.readLine(), 2);
        BigInteger result = B1.multiply(B2);
        System.out.println(result.toString(2));
        br.close();
    }

}
