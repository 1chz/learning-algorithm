package baekjoon;

import java.io.*;
import java.util.*;
/**
 * @see <a href="https://www.acmicpc.net/problem/1080">
 * https://www.acmicpc.net/problem/1080 За·Д
 * </a>
 */
public class BOJ_1080 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer token = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(token.nextToken());
		int M = Integer.parseInt(token.nextToken());
		
		boolean[][] input = new boolean[N][M];
		boolean[][] result = new boolean[N][M];
		int cnt = 0;
		
		for (int i = 0; i < N; i++) {
			String read = br.readLine();
			for (int j = 0; j < M; j++) {
				input[i][j] = (read.charAt(j) - 48) == 0? false : true;
			}
		}
		for (int i = 0; i < N; i++) {
			String read = br.readLine();
			for (int j = 0; j < M; j++) {
				result[i][j] = read.charAt(j) - 48 == 0? false : true;
			}
		}
		br.close();
		
		for (int i = 0; i < N - 2; i++) {
			for (int j = 0; j < M - 2; j++) {
				if(input[i][j] != result[i][j]) {
					for (int k_col = i; k_col < i + 3; k_col++) {
						for (int k_row = j; k_row < j + 3; k_row++) {
							input[k_col][k_row] = !input[k_col][k_row];
						}
					}
					cnt++;
				}
			}
		}
		
		if(!Arrays.deepEquals(input, result)) cnt = -1;
		System.out.println(cnt);
	}
}
