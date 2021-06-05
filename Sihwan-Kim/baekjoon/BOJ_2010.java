package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @see <a href="https://www.acmicpc.net/problem/2010">
 *      https://www.acmicpc.net/problem/2010 </a>
 */
public class BOJ_2010 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int multitapCnt = Integer.parseInt(br.readLine());

		int totalCnt = 0;
		for (int i = 0; i < multitapCnt; i++) {
			int plugCnt = Integer.parseInt(br.readLine());
			totalCnt += plugCnt;

		}

		System.out.println(totalCnt - (multitapCnt - 1));

	}
}