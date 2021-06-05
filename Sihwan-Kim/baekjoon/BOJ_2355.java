package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/2355">
 *      https://www.acmicpc.net/problem/2355 </a>
 */
public class BOJ_2355 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		br.close();
		long a = Long.parseLong(st.nextToken());
		long b = Long.parseLong(st.nextToken());
		long c = 0;
		

		if (a <= b) {
			c = ((b - a + 1) * (a + b)) / 2;
		} else {
			c = ((a - b + 1) * (a + b)) / 2;
		}

		System.out.println(c);
	}

}
