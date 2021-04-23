package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/8958">
 *      https://www.acmicpc.net/problem/8958 </a>
 */
public class BOJ_8958 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = Integer.parseInt(br.readLine());

		for (int i = 0; i < max; i++) {
			String readLine = br.readLine();

			String[] split = readLine.split("");
			int sum = 0;
			int cnt = 1;
			for (String str : split) {
				if (str.equals("O")) {
					sum += cnt;
					cnt++;
				} else {
					cnt = 1;
				}
			}
			System.out.println(sum);
		}

	}
}