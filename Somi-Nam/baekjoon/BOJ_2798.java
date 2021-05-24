package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
/**
 * @see <a href="https://www.acmicpc.net/problem/2798">
 * https://www.acmicpc.net/problem/2798 ∫Ì∑¢¿Ë
 * </a>
 */
public class BOJ_2798 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer token = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(token.nextToken());
		int M = Integer.parseInt(token.nextToken());
		
		StringTokenizer cardToken = new StringTokenizer(br.readLine(), " ");
		br.close();
		
		int[] card = new int[N];
		for (int i = 0; i < N; i++) {
			card[i] = Integer.parseInt(cardToken.nextToken());
		}
		
		int sum = 0;
		int newSum = 0;
		for (int f = 0; f < card.length - 2; f++) {
			for (int s = f + 1; s < card.length - 1; s++) {
				for (int t = s + 1; t < card.length; t++) {
					newSum = card[f] + card[s] + card[t];
					if(M - newSum < 0) continue;
					sum = M - sum > M - newSum? newSum : sum;
				}
			}
		}
		System.out.println(sum);
	}
}
