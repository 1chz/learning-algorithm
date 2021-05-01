package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/11720">
 *      https://www.acmicpc.net/problem/11720 </a>
 */
public class BOJ_11720 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();

		int sum = 0;
		for (byte val : br.readLine().getBytes()) {
			sum += (val - '0');
		}
		System.out.println(sum);
	}
}