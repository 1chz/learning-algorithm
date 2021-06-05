package baekjoon;

import java.io.*;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/1110
 */
public class BOJ_1110 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cycle = 1;
		
		int newN = N;
		while(true) {
			int sum = (newN / 10) + (newN % 10);
			newN = ((newN % 10) * 10) + (sum % 10);
			
			if(newN == N) break;
			cycle++;
		}
		
		System.out.println(cycle);
		br.close();
	}
}
