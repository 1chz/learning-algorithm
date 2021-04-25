package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/1100">
 *      https://www.acmicpc.net/problem/1100 </a>
 */
public class BOJ_1100 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		final int SIZE = 8;
		// 체스판
		char[][] chessBoard = new char[SIZE][SIZE];
		// 하얀 칸위의 말 개수;
		int num = 0;

		for (int i = 0; i < SIZE; i++) {
			String line = br.readLine();
			for (int j = 0; j < SIZE; j++) {
				chessBoard[i][j] = line.charAt(j);

				// (i + j)를 2로 나눈 나머지가 0인 경우 => 하얀 칸이다.
				if ((i + j) % 2 == 0 && chessBoard[i][j] == 'F') {
					num++;
				}
			}
		}

		System.out.println(num);

	}
}