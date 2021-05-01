package baekjoon;

import java.io.*;

/**
 * @see <a href="https://www.acmicpc.net/problem/2153">
 * https://www.acmicpc.net/problem/2153 소수 단어
 * </a>
 */
public class BOJ_2153 {
	static final String PRIME_ANSWER = "It is a prime word.";
	static final String NOT_PRIME_ANSWER = "It is not a prime word.";
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String read = br.readLine();
		br.close();

		int sum = 0;
		for (int i = 0; i < read.length(); i++) {
			int c = read.charAt(i);
			if(c > 96) {
				c = c - 96;
			} else if(c < 92) {
				// A가 60 Z가 91
				c = c - 38;
			}
			sum += c;
		}
		
		for (int i = 2; i < sum; i++) {
			if(sum % i == 0) {
				System.out.println(NOT_PRIME_ANSWER); // 소수가 아님
				return;
			}
		}
		
		System.out.println(PRIME_ANSWER); // 소수
	}
}
