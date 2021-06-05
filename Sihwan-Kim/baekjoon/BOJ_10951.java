package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/10951">
 *      https://www.acmicpc.net/problem/10951 </a>
 */
public class BOJ_10951 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String line;
		while ((line = br.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(line, " ");
			System.out.println(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
		}

	}
}