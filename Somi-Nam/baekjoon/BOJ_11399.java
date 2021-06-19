package baekjoon;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
/**
 * @see <a href="https://www.acmicpc.net/problem/11399">
 * https://www.acmicpc.net/problem/11399 ATM
 * </a>
 */
public class BOJ_11399 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer token = new StringTokenizer(br.readLine(), " ");
		br.close();
		
		int[] p = new int[n];
		for (int i = 0; i < p.length; i++) {
			p[i] = Integer.parseInt(token.nextToken());
		}
		
		Arrays.sort(p);
		
		int total = 0;
		for (int i = 0,takeMinute = 0; i < p.length; i++) {
			takeMinute += p[i];
			total += takeMinute;
		}
		
		System.out.println(total);
	}
}
