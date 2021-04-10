package baekjoon;

import java.io.*;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/2446
 */
public class Main_2446 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		
		StringBuilder builder = new StringBuilder();
		for (int i = n, space = 0; i > 0; i--, space++) {
			for (int j = 0; j < space; j++) builder.append(" ");
			for (int j = 0; j < (2*i - 1); j++) builder.append("*");
			builder.append("\n");
		}
		for (int i = 2, space = n-2; i <= n; i++, space--) {
			for (int j = 0; j < space; j++) builder.append(" ");
			for (int j = 0; j < (2*i -1); j++) builder.append("*");
			builder.append("\n");
		}
		
		bw.write(builder.toString());
		bw.flush();
		
		bw.close();
		br.close();
	}
}
