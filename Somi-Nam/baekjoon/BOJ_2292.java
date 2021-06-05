package baekjoon;

import java.io.*;

/**
 * @see <a href="https://www.acmicpc.net/problem/2292">
 * https://www.acmicpc.net/problem/2292 ¹úÁý
 * </a>
 */
public class BOJ_2292 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		long sum = 1;
		if(n == 1) {
			System.out.println(1);
			return;
		} else {
			int room = 1;
			for (; sum < 1000000000; room++) {
				sum = sum + (6 * room);
				if(sum >= n) {
					 break;
				}
			}
			System.out.println(room + 1);
		}
	}
}
