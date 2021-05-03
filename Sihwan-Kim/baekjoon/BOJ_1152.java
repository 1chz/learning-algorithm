package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/1152">
 *      https://www.acmicpc.net/problem/1152 </a>
 */
public class BOJ_1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] split = br.readLine().split(" ");

		int length = split.length;
		if (split.length > 0 && split[0].equals("")) {
			length -= 1;
		}

		System.out.println(length);

	}
}
