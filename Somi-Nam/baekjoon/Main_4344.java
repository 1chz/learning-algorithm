package baekjoon;

import java.io.*;
import java.util.*;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/4344
 */
public class Main_4344 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringBuilder builder = new StringBuilder();
		int c = Integer.parseInt(br.readLine());
		for (int i = 0, testCaseSum = 0, averageStudent = 0; i < c; i++, testCaseSum = 0, averageStudent = 0) {
			StringTokenizer token = new StringTokenizer(br.readLine(), " ");
			int student = Integer.parseInt(token.nextToken());
			Integer[] scoreArray = new Integer[student];
			for (int j = 0; j < student; j++) {
				scoreArray[j] = Integer.parseInt(token.nextToken());
				testCaseSum += scoreArray[j];
			}
			
			double testCaseAverage = testCaseSum / scoreArray.length;
			for (Integer score : scoreArray) {
				if(score > testCaseAverage) averageStudent++;
			}
			
			double answer = ((double) averageStudent / (double) scoreArray.length) * 100;
			builder.append(String.format("%.3f", answer)).append("%").append("\n");
		}
		
		
		bw.write(builder.toString());
		bw.flush();
		
		br.close();
		bw.close();
	}
}
