package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @see <a href="https://www.acmicpc.net/problem/2439">
 *      https://www.acmicpc.net/problem/2439 </a>
 */
public class BOJ_2439 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				bw.write(' ');
			}
			for (int k = 0; k < i; k++) {
				bw.write('*');
			}
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}