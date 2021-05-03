package baekjoon;

import java.io.*;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/2438
 */
public class Main_2438 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				builder.append("*");
			}
			builder.append("\n");
		}
		
		bw.write(builder.toString());
		
		br.close();
		bw.close();
	}
}
