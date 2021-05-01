package baekjoon;

import java.io.*;
import java.util.*;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/2953
 */
public class Main_2953 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int participant = 0;
		int sum = Integer.MIN_VALUE;
		for (int i = 0; i < 5; i++) {
			int score = 0;
			StringTokenizer token = new StringTokenizer(br.readLine(), " ");
			do {
				score += Integer.parseInt(token.nextToken());
			} while (token.hasMoreTokens());
			
			if(score > sum) {
				participant = i + 1;
				sum = score;
			}
		}
		
		bw.write(participant + " " + sum);
		bw.flush();
		
		bw.close();
		br.close();
	}
}
