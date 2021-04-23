package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/10871">
 *      https://www.acmicpc.net/problem/10871 </a>
 */
public class BOJ_10871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer line1 = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(line1.nextToken());
		int x = Integer.parseInt(line1.nextToken());

		StringBuilder sb = new StringBuilder();

		StringTokenizer line2 = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			int value = Integer.parseInt(line2.nextToken());

			if (value < x) {
				sb.append(value).append(' ');
			}
		}

		System.out.println(sb);

		br.close();
	}
}