package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/1236">
 * https://www.acmicpc.net/problem/1236 성 지키기
 * </a>
 */
public class BOJ_1236 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(token.nextToken()); // 세로 줄 // 더 큰 값
		int M = Integer.parseInt(token.nextToken()); // 가로 줄
		
		char[][] castle = new char[N][M];
		
		int rowCnt = 0;
		int columCnt = 0;
		
		for (int i = 0; i < N; i++) {
			String read = br.readLine();
			for (int j = 0; j < M; j++) {
				castle[i][j] = read.charAt(j);
			}
			
			// 가로줄 검사
			if(!read.contains("X")) {
				rowCnt++;
			}
		}

		// 세로줄 검사
		columnLoop : for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				char c = castle[j][i];
				if(c == 'X') {
					continue columnLoop;
				}
			}
			columCnt++;
		}
		
		System.out.println(Math.max(rowCnt, columCnt));
	}
}
