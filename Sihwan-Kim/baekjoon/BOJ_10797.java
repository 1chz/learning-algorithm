package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/10797">
 *      https://www.acmicpc.net/problem/10797 </a>
 */
public class BOJ_10797 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int day = Integer.parseInt(br.readLine()) % 10;
		StringTokenizer st = new StringTokenizer(br.readLine());

		int matchCnt = 0;
		for (int i = 0; i < 5; i++) {
			if (Integer.parseInt(st.nextToken()) == day) {
				matchCnt++;
			}
		}

		System.out.println(matchCnt);
	}
}