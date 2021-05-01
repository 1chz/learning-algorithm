package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/10996">
 *      https://www.acmicpc.net/problem/10996 </a>
 */
public class BOJ_10996 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		StringBuffer sb = new StringBuffer();

		// 첫번째행
		for (int i = 0; i < N; i++) {
			if (i % 2 == 0) {
				sb.append('*');
			} else {
				sb.append(' ');
			}
		}
		sb.append('\n');

		// 두번째행
		for (int i = 0; i < N; i++) {
			if (i % 2 != 0) {
				sb.append('*');
			} else {
				sb.append(' ');
			}
		}
		sb.append('\n');

		String str = sb.toString();

		for (int i = 1; i < N; i++) {
			sb.append(str);
		}

		System.out.println(sb);

	}
}