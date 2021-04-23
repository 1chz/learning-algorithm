package baekjoon;

import java.io.*;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/2445
 */
public class Main_2455 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		StringBuilder builder = new StringBuilder();
		
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) builder.append("*");
			for (int j = 0; j < 2*(n-i); j++) builder.append(" ");
			for (int j = 0; j < i; j++) builder.append("*");
			builder.append("\n");
		}
		for (int i = n-1; i >= 0; i--) {
			for (int j = 0; j < i; j++) builder.append("*");
			for (int j = 0; j < 2*(n-i); j++) builder.append(" ");
			for (int j = 0; j < i; j++) builder.append("*");
			if(i != 1) builder.append("\n");
		}
		
		bw.write(builder.toString());
		bw.flush();
		
		bw.close();
		br.close();
	}
}
