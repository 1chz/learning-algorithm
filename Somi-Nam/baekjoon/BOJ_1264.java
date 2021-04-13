package baekjoon;

import java.io.*;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/1264
 */
public class BOJ_1264 {
	enum Vowel {
		a, e, i, o, u,
		A, E, I, O, U,
		;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder builder = new StringBuilder();
		while (true) {
			String read = br.readLine();
			int cnt = 0;
			if(read.equals("#")) break;
			char[] readChar = read.toCharArray();
			for (char c : readChar) {
				try {
					if(Vowel.valueOf(String.valueOf(c)) != null) cnt++;
				} catch (IllegalArgumentException e) {
					continue;
				}
			}
			builder.append(cnt).append("\n");
		}
		
		bw.write(builder.toString());
		bw.flush();
		
		bw.close();
		br.close();
	}
}
