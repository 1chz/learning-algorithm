package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
/**
 * @see <a href="https://www.acmicpc.net/problem/number">
 * https://www.acmicpc.net/problem/number
 * </a>
 */
public class BOJ_11047 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer token = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(token.nextToken());
		int k = Integer.parseInt(token.nextToken());
		
		int[] coins = new int[n];
		for (int i = coins.length - 1; i >= 0 ; i--) {
			coins[i] = Integer.parseInt(br.readLine());
		}
		br.close();
		
		
		int resultCoin = 0;
		for (int i = 0; i < coins.length; i++) {
			if(coins[i] > k) continue;
			else {
				resultCoin += (k / coins[i]);
				k = k % coins[i];
			}
		}
		
		System.out.println(resultCoin);
	}
}
