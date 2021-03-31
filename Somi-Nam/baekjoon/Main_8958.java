package baekjoon;

import java.io.*;
import java.util.*;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/8958
 */
public class Main_8958 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt(br.readLine());
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < cnt; i++) {
			try {
				StringTokenizer token = new StringTokenizer(br.readLine(), "X");
				int sum = 0;
				do {
					int n = token.nextToken().length();
					sum += (n*(n+1) / 2); 
				} while (token.hasMoreTokens());
				builder.append(sum+"").append("\n");
			} catch (NoSuchElementException e) {
				builder.append("0").append("\n");
			}
		}
		
		bw.write(builder.toString());
		bw.flush();
		
		br.close();
		bw.close();
	}
}
