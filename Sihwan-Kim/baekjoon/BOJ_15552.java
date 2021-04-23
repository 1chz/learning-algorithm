package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/15552">
 *      https://www.acmicpc.net/problem/15552 </a>
 */
public class BOJ_15552 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int max = Integer.parseInt(br.readLine());

		for (int i = 0; i < max; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int c = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
			bw.write(c + "");
			bw.newLine();
		}
		br.close();
		bw.flush();
		bw.close();
	}
}