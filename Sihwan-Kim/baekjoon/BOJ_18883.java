package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/18883">
 *      https://www.acmicpc.net/problem/18883 </a>
 */
public class BOJ_18883 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		br.close();

		int cnt = 1;
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				bw.append(String.valueOf(cnt++));
				if (M - 1 != j) {
					bw.append(" ");
				}
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}