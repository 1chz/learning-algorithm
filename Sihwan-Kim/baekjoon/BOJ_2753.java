package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/2753">
 *      https://www.acmicpc.net/problem/2753 </a>
 */
public class BOJ_2753 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int intput = Integer.parseInt(br.readLine());
		if (intput % 4 == 0 && (intput % 100 != 0 || intput % 400 == 0)) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}