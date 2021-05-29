package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/4344">
 *      https://www.acmicpc.net/problem/4344 </a>
 */
public class BOJ_4344 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testcase = Integer.parseInt(br.readLine());

		for (int i = 0; i < testcase; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			int N = Integer.parseInt(st.nextToken());

			int arr[] = new int[N];
			int sum = 0;
			for (int j = 0; j < N; j++) {
				int val = Integer.parseInt(st.nextToken());
				arr[j] = val;
				sum += val;
			}
			double avg = sum / N;

			double cnt = 0;
			for (int k = 0; k < N; k++) {
				if (arr[k] > avg) {
					cnt++;
				}
			}

			System.out.println(String.format("%.3f", (cnt / N) * 100) + "%");
		}
	}
}