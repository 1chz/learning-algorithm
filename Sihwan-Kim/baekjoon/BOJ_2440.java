package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @see <a href="https://www.acmicpc.net/problem/2440">
 *      https://www.acmicpc.net/problem/2440 </a>
 */
public class BOJ_2440 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		br.close();

		for (int i = N; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				bw.append('*');
			}
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}