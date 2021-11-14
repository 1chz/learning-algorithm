package src.baekjoon.beginner100.b;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

import static java.math.BigInteger.valueOf;

/**
 * @see <a href="https://www.acmicpc.net/problem/5893">
 * https://www.acmicpc.net/problem/5893
 * </a>
 */
public class BOJ_5893 {
    
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String binary = br.readLine();
        BigInteger intValue = new BigInteger(binary, 2).multiply(valueOf(17));
        System.out.print(intValue.toString(2));
        br.close();
    }
    
}
