package baekjoon;

import java.io.*;

/**
 * https://www.acmicpc.net/problem/1312
 * @author ndanl
 */
public class BOJ_1312 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		br.close();
		
		int a = Integer.parseInt(input[0]);
		int b = Integer.parseInt(input[1]);
		int n = Integer.parseInt(input[2]);
		
		int remain = (a % b);
		int answer = 0;
		for (int i = 1; i <= n; i++) {
			answer = (remain*10) / b;
			remain = (remain*10) % b;
		}
		System.out.println(answer);

		// 반례 1 3 1000000
		// 나누기를 직접 구현해야한다는 뜻
//		double value = a / b;
//		int answer = (int) ((value * Math.pow(10, n)) % 10);
//		System.out.println(answer);
	}
}
