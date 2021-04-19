package baekjoon;

import java.io.*;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/1964
 */
public class Main_1964 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int s = 45678;
		
		long  answer = 5; // 점 한개
		/**
		 * 1 - 5
		 * 2 - 12 = 5 + ((2 + 1) * 3 - 2) / 5 + 7
		 * 3 - 22 = 12 + ((3 + 1) * 3 - 2) / 5 + 7 + 10
		 * 4 - 35 = 5 + '7 + 10 + 13' -> 5 + (7부터 시작 3씩 커지는 항 합)
		 */
		for (int i =2; i <= n; i++) {
			answer += ((i + 1) * 3 - 2);
		}
		
		
		bw.write((answer % s)+"");
		bw.flush();
		
		bw.close();
		br.close();
	}
}
