package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/18883
 */
public class Main_18883 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer token = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(token.nextToken());
		int m = Integer.parseInt(token.nextToken());
		
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0, cnt = 1; i < n; i++) {
			for (int j = 0; j < m; j++) {
				builder.append(cnt++);
				if(j != m-1) builder.append(" ");
			}
			builder.append("\n");
		}
		
		bw.write(builder.toString());
		bw.flush();
		
		bw.close();
		br.close();
	}
}
