package baekjoon;

import java.io.*;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/15829
 */
public class Main_15829 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// a = 1, z = 26
		int l = Integer.parseInt(br.readLine());
		int r = 31;
		int M = 1234567891; // 유한한 값
		
		// Mod n의 속성
//		1. (a + b) mod n = {(a mod n) + (b mod n)} mod n
//		2. (a - b) mod n = {(a mod n) - (b mod n)} mod n
//		3. (a * b) mod n = {(a mod n) * (b mod n)} mod n
		
		char[] charList = br.readLine().toCharArray();
		long sum = 0;
		for (int i = 0; i < charList.length; i++) {
			long temp = charList[i] - 'a' + 1;
			for (int j = 0; j < i; j++) {
				temp = (temp * r) % M; // Mod n의 속성 3, 31을 i만큼 곱할 때 마다 Mod M을 해준다
			}
			sum = (sum + temp) % M; // Mod n의 속성 1번, 각 합의 Mod M
		}
		
		System.out.println((long) sum);
		br.close();
	}
}
