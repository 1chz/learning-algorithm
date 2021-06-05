package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/1008">
 *      https://www.acmicpc.net/problem/1008 </a>
 */
public class BOJ_1008 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] split = br.readLine().split(" ");
		br.close();

		System.out.println(Double.parseDouble(split[0]) / Double.parseDouble((split[1])));
	}
}
