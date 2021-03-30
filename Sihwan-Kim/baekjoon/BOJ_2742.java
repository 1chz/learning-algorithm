package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/2742">
 *      https://www.acmicpc.net/problem/2742 </a>
 */
public class BOJ_2742 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = Integer.parseInt(br.readLine());

		for (int i = max; i > 0; i--) {
			System.out.println(i);
		}
	}
}