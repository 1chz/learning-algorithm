package baekjoon;

import java.io.*;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/10996
 */
public class Main_10996 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		// 3
//		* *	// 3까지의 홀수
//		 *	// 3까지의 짝수
//		* *
//		 *
//		* *
//		 *
		StringBuilder odd = new StringBuilder();
		StringBuilder even = new StringBuilder().append(" ");
		for (int i = 1; i <= n; i++) {
			if(i % 2 == 0) even.append("*").append(" ");
			else odd.append("*").append(" ");
		}
		
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < n; i++) {
			builder.append(odd.toString()).append("\n").append(even.toString()).append("\n");
		}
		
		bw.write(builder.toString());
		bw.flush();
		
		bw.close();
		br.close();
	}
}
