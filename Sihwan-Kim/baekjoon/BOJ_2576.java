package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/2576">
 *      https://www.acmicpc.net/problem/2576 </a>
 */
public class BOJ_2576 {
	public static void main(String[] args) throws IOException {

		int sum = 0;
		int min = 101;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 7; i++) {
			int parseInt = Integer.parseInt(br.readLine());

			if (parseInt % 2 != 0) {
				sum += parseInt;
				if (min > parseInt) {
					min = parseInt;
				}
			}

		}

		if (sum != 0) {
			System.out.println(sum + "\n" + min);
		} else {
			System.out.println(-1);
		}

	}
}