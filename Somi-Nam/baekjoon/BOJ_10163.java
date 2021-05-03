package baekjoon;

import java.io.*;
import java.util.*;

/**
 * https://www.acmicpc.net/problem/10163
 * @author NSM
 */
public class BOJ_10163 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		Integer[][] point = new Integer[101][101];
		for (int i = 0; i < n; i++) {
			// x, y에 n을 넣자
			StringTokenizer token = new StringTokenizer(br.readLine(), " ");
			
			int x = Integer.parseInt(token.nextToken());
			int y = Integer.parseInt(token.nextToken());
			int width = Integer.parseInt(token.nextToken());
			int height = Integer.parseInt(token.nextToken());
			
			for (int w = x; w < x + width; w++) {
				for (int h = y; h < y + height; h++) {
					point[w][h] = i;
				}
			}
		}
		
		br.close();
		StringBuilder builder = new StringBuilder();
		
		HashMap<Integer, Integer> answer = new HashMap<Integer, Integer>();
		for (int i = 0; i < 101; i++) {
			for (int j = 0; j < 101; j++) {
				try {
					int v = point[i][j];
					answer.put(v, answer.getOrDefault(v, 0) + 1);
				} catch (NullPointerException e) {
					continue;
				}
			}
		}
		
		for (int i = 0; i < n; i++) {
			builder.append(answer.getOrDefault(i, 0)).append("\n");
		}
		bw.write(builder.toString());
		bw.flush();
		
		bw.close();
	}
	
}
