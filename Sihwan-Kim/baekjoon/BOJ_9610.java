package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/9610">
 *      https://www.acmicpc.net/problem/9610 </a>
 */
public class BOJ_9610 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int q1 = 0;
		int q2 = 0;
		int q3 = 0;
		int q4 = 0;
		int axis = 0;
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			if (x > 0 && y > 0) {
				q1++;
			} else if (x < 0 && y > 0) {
				q2++;
			} else if (x < 0 && y < 0) {
				q3++;
			} else if (x > 0 && y < 0) {
				q4++;
			} else {
				axis++;
			}
		}

		System.out.println("Q1: " + q1);
		System.out.println("Q2: " + q2);
		System.out.println("Q3: " + q3);
		System.out.println("Q4: " + q4);
		System.out.println("AXIS: " + axis);
	}
}