package baekjoon;

import java.io.*;
/**
 * @see <a href="https://www.acmicpc.net/problem/2231">
 * https://www.acmicpc.net/problem/2231 분해합
 * </a>
 */
public class BOJ_2231 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		br.close();
		
		// 임의의 수 N이 들어올 때, 해당 수는 K + 'K각 자리 수'
		// 'K각 자리수'의 최대 합은 (9 * 각 자리 수)
		// 따라서 (N - (9 * 'K 각 자리 수')) ~ (N)사이 값만 탐색하면 된다
		
		int cnt = 0;
		int tempN = N;
		while(tempN != 0) {
			tempN = tempN / 10;
			cnt++;
		}
		
		for (int i = (N - (9 * cnt)), sum = 0, temp = 0; i < N; i++, sum = 0, temp = 0) {
			temp = i;
			while(temp != 0) {
				sum += temp % 10;
				temp = temp / 10;
			}
			sum += i;
			if(sum == N) {
				System.out.println(i);
				return;
			}
		}
		System.out.println("0");
	}
}
