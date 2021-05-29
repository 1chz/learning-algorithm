package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/9610
 */
public class Main_9610 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		Integer[] square = new Integer[] {0, 0, 0, 0, 0};
		
		for (int i = 0; i < n; i++) {
			StringTokenizer token = new StringTokenizer(br.readLine(), " ");
			long x = Integer.parseInt(token.nextToken());
			long y = Integer.parseInt(token.nextToken());
			
			if(x * y == 0) {
				square[4] = square[4] + 1; // AXIS
			} else if(x * y > 0) {
				if(x > 0) {
					// 1
					square[0] = square[0] + 1; // AXIS
				} else {
					// 3
					square[2] = square[2] + 1; // AXIS
				}
			} else {
				if(x > 0) {
					// 4
					square[3] = square[3] + 1; // AXIS
				} else {
					// 2
					square[1] = square[1] + 1; // AXIS
				}
			}
		}
		
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < square.length; i++) {
			if(i != square.length -1) builder.append("Q"+ (i+1));
			else builder.append("AXIS");
			builder.append(": ").append(square[i]).append("\n");
		}
		
		bw.write(builder.toString());
		bw.flush();
		
		bw.close();
		br.close();
	}
}
