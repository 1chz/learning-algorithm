package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
/**
 * @see <a href="https://www.acmicpc.net/problem/2828">
 * https://www.acmicpc.net/problem/2828
 * </a>
 */
public class BOJ_2828 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(token.nextToken());
		int M = Integer.parseInt(token.nextToken());
		int[] basket = {1, M};
		
		int move = 0;
		
		int j = Integer.parseInt(br.readLine());
		for (int i = 0; i < j; i++) {
			int input = Integer.parseInt(br.readLine());
			// 왼쪽에 있는지 오른쪽에 있는지 파악
			if(input < basket[0]) {
				// 왼쪽
				move += (basket[0] - input);
				basket[0] = input;
				basket[1] = input + M - 1;
			} else if (input >= basket[1]) {
				// 오른쪽
				move += (input - basket[1]);
				basket[1] = input;
				basket[0] = basket[1] - M + 1;
			}
		}
		br.close();
		
		System.out.println(move);
	}
}
