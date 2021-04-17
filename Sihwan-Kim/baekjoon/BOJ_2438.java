package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @see <a href="https://www.acmicpc.net/problem/2438">
 *      https://www.acmicpc.net/problem/2438 </a>
 */
public class BOJ_2438 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		br.close();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				bw.write('*');
			}
			bw.newLine();
		}

		bw.flush();
		bw.close();
	}
}