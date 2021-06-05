package baekjoon;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/1157
 * @author ndanl
 */
public class BOJ_1157 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String read = br.readLine().trim();
		br.close();
		
		// 공백 처리..
		if(read.length() == 0) {
			System.out.println("?");
			return;
		}
		
		int[] alphabet = new int[26];
		for (int i = 0; i < read.length(); i++) {
			int c = read.charAt(i) - 'a';
			if(c < -1) c += 32; // 대문자 -> 소문자
			alphabet[c]++;
		}
		
		int max = Integer.MIN_VALUE;
		int maxCnt = 0;
		for (int i = 0; i < alphabet.length; i++) {
			if(alphabet[i] != 0 && alphabet[i] > max) {
				max = alphabet[i];
				maxCnt = i;
			}
		}
		
		for(int i = 0; i < alphabet.length; i++) {
			if(i == maxCnt) continue;
			if(alphabet[i] == max) {
				System.out.println("?");
				return;
			}
		}

		System.out.println(String.valueOf((char) (maxCnt + 'a' - 32))); // 대문자 변환
	}

}
