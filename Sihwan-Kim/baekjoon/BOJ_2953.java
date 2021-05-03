package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/2953">
 *      https://www.acmicpc.net/problem/2953 </a>
 */
public class BOJ_2953 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int firstIndex = 0;
		int firstTotal = 0;
		for (int i = 1; i <= 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int total = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())
					+ Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());

			if (total > firstTotal) {
				firstIndex = i;
				firstTotal = total;
			}
		}

		System.out.println(firstIndex + " " + firstTotal);
	}
}