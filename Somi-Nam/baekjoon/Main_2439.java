package baekjoon;

import java.io.*;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/2439
 */
public class Main_2439 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringBuilder builder = new StringBuilder();
		
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > 0; j--) {
				if(j <= i) {
					builder.append("*");
				} else {
					builder.append(" ");
				}
			}
			builder.append("\n");
		}
		
		bw.write(builder.toString());
		bw.flush();
		
		br.close();
		bw.close();
	}
}
