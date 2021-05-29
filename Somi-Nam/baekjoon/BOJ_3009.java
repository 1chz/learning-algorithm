package baekjoon;

import java.io.*;
import java.util.*;


/**
 * @see <a href="https://www.acmicpc.net/problem/3009">
 * https://www.acmicpc.net/problem/3009 네 번째 점
 * </a>
 */
public class BOJ_3009 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] x = new int[3];
		int[] y = new int[3];
		
		for (int i = 0; i < 3; i++) {
			StringTokenizer token = new StringTokenizer(br.readLine(), " ");
			int X = Integer.parseInt(token.nextToken());
			int Y = Integer.parseInt(token.nextToken());
			
			x[i] = X;
			y[i] = Y;
		}
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		StringBuilder builder = new StringBuilder();
		// x
		if(x[0] != x[1]) {
			// 작은 값이 하나 밖에 없음
			builder.append(x[0]).append(" ");
		} else {
			// 큰 값이 하나 밖에 없음
			builder.append(x[2]).append(" ");
		}
		
		// y
		if(y[0] != y[1]) {
			// 작은 값이 하나 밖에 없음
			builder.append(y[0]);
		} else {
			// 큰 값이 하나 밖에 없음
			builder.append(y[2]);
		}
		
		bw.write(builder.toString());
		bw.flush();
		
		bw.close();
		br.close();
	}
}
