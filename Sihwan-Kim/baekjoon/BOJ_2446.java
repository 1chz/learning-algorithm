package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/2446">
 *      https://www.acmicpc.net/problem/2446 </a>
 */
public class BOJ_2446 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		
		for (int i = 0; i < N; i++) { // 1 ~ N
			for (int j = 0; j < i; j++) { // 공백
				sb.append(' ');
			}

			for (int k = 0; k < (2 * N - 1) - (2 * i); k++) { // 별
				sb.append('*');
			}
			sb.append('\n');
		}

		for (int i = 0; i < N - 1; i++) { // N+1 ~ 2N-1
			for (int j = 1; j < (N - 1) - i; j++) { // 공백
				sb.append(' ');
			}

			for (int k = 0; k < 3 + (2 * i); k++) { // 별
				sb.append('*');
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}