package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/10039">
 *      https://www.acmicpc.net/problem/10039 </a>
 */
public class BOJ_10039 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int total = 0;
		for (int i = 0; i < 5; i++) {
			int inputNum = Integer.parseInt(br.readLine());

			total += inputNum > 40 ? inputNum : 40;
		}

		System.out.println(total / 5);
	}
}