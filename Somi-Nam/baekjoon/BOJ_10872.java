package baekjoon;

import java.io.*;
/**
 * @see <a href="https://www.acmicpc.net/problem/10872">
 * https://www.acmicpc.net/problem/10872 ÆÑÅä¸®¾ó
 * </a>
 */
public class BOJ_10872 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
//		System.out.println(factorial(n));
		System.out.println(tailFactorial(n, 1));
	}
	
//	private static int factorial(int n) {
//		if(n == 0) {
//			return 1;
//		} else {
//			return n * factorial(n - 1);
//		}
//	}
	
	private static int tailFactorial(int n, int acc) {
		if(n == 0) {
			return acc;
		} else {
			return tailFactorial(n - 1, n * acc);
		}
	}
}
