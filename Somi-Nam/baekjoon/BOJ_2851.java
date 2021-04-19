package baekjoon;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/2851
 * @author ndanl
 */
public class BOJ_2851 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int score = 100;
		int total = 0;
		
		for (int i = 0; i < 10; i++) {
			int mushi = Integer.parseInt(br.readLine());
			int sumMushi = total + mushi;
			
			if(sumMushi == score || Math.abs(total - score) >= Math.abs(sumMushi - score)) {
				total = sumMushi;
			}
			if(sumMushi >= 100) break; // 먹지 않기로 했다면 바로 break;
		}
		br.close();
		System.out.println(total);
	}
}
