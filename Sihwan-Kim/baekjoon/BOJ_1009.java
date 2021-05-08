package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/1009">
 *      https://www.acmicpc.net/problem/1009 </a>
 */
public class BOJ_1009 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int rs = 1;
			for (int j = 0; j < b; j++) {
				rs = (rs * a) % 10;
			}
			System.out.println(rs == 0 ? 10 : rs);
		}
	}
}