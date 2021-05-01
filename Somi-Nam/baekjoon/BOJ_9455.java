package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/9455">
 * https://www.acmicpc.net/problem/9455 박스
 * </a>
 */
public class BOJ_9455 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < T; i++) {
			StringTokenizer token = new StringTokenizer(br.readLine(), " ");
			int m = Integer.parseInt(token.nextToken()); // 행
			int n = Integer.parseInt(token.nextToken()); // 열
			
			int[][] box = new int[m][n];
			for (int j = 0; j < m; j++) {
				StringTokenizer rowToken = new StringTokenizer(br.readLine(), " ");
				for (int k = 0; k < n; k++) {
					box[j][k] = Integer.parseInt(rowToken.nextToken());
				}
			}
			
			int moveCnt = 0;
			for (int column = 0; column < n; column++) {
				for (int row = 0; row < m; row++) {
					int check = box[row][column];
					if(check != 1) continue;
					else {
						for (int rowUnder = row; rowUnder < m; rowUnder++) {
							int checkUnder = box[rowUnder][column];
							if(checkUnder == 0) moveCnt++;
						}
					}
				}
			}
			
			builder.append(moveCnt).append("\n");
		}
		
		bw.write(builder.toString());
		bw.flush();
		
		bw.close();
		br.close();
	}
}
