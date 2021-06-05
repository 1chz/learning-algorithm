package baekjoon;

import java.io.*;

/**
 * @see <a href="https://www.acmicpc.net/problem/2456">
 * https://www.acmicpc.net/problem/2456 나는 학급회장이다
 * </a>
 */
public class BOJ_2456 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[][] scorePer = new int[3][4]; // 총점, 1점, 2점, 3점
		String[] score;
		for (int i = 0; i < n; i++) {
			score = br.readLine().split(" ");
			for (int j = 0; j < score.length; j++) {
				int value = Integer.parseInt(score[j]);
				scorePer[j][0] = scorePer[j][0] + value;
				scorePer[j][value]++;
			}
		}
		br.close();
		
		int max = Integer.MIN_VALUE;
		int per = Integer.MIN_VALUE;
		for (int i = 0; i < scorePer.length; i++) {
			if(scorePer[i][0] > max) {
				max = scorePer[i][0];
				per = i;
			} else if(max == scorePer[i][0]) {
				if(per == Integer.MIN_VALUE) per = i - 1;
				for (int j = 3; j >= 1; j--) {
					int scoreMaxPer = scorePer[per][j];
					int scoreThisPer = scorePer[i][j];
					if(scoreMaxPer == scoreThisPer) {
						if(j == 1) per = Integer.MIN_VALUE;
						continue;
					} else if(scoreMaxPer > scoreThisPer) {
						break;
					} else {
						per = i;
						break;
					}
				}
			}
		}
		
		StringBuilder builder = new StringBuilder();
		per = per == Integer.MIN_VALUE ? 0 : per + 1;
		builder.append(per).append(" ").append(max);
		
		bw.write(builder.toString());
		bw.flush();

		bw.close();
	}
}
