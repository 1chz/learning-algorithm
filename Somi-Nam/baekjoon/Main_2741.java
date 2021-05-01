package baekjoon;

import java.io.*;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/2741
 */
public class Main_2741 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < n; i++) {
			builder.append(i+1).append("\n");
		}
		
		bw.write(builder.toString());
		bw.flush();
		
		br.close();
		bw.close();
	}
}
