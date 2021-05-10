package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/10757">
 * https://www.acmicpc.net/problem/10757
 * </a>
 */
public class BOJ_10757 {
	public static void main(String[] args) throws Exception {
		// 流立 拌魂 or BigInteger
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine());
		br.close();
		
		// BigInteger
		BigInteger a = new BigInteger(token.nextToken());
		BigInteger b = new BigInteger(token.nextToken());
		
		System.out.println(a.add(b).toString());
		
		// 流立 拌魂
	}
}
