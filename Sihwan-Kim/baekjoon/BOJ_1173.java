package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/1173">
 *      https://www.acmicpc.net/problem/1173 </a>
 */
public class BOJ_1173 {
	static int N, m, M, T, R;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		N = Integer.parseInt(st.nextToken()); // 분
		m = Integer.parseInt(st.nextToken()); // 최저 맥박
		M = Integer.parseInt(st.nextToken()); // 최대 맥박
		T = Integer.parseInt(st.nextToken()); // 운동
		R = Integer.parseInt(st.nextToken()); // 휴식

		if (M < T + m)
			System.out.println(-1);
		else
			exercise(0, 0, m);
	}

	public static void exercise(int time, int e_num, int X) {

		if (e_num == N) {
			System.out.println(time);
		} else {
			// 운동
			if (X + T <= M) {
				exercise(time + 1, e_num + 1, X + T);
			} else {
				// 휴식 - 최저맥박보다 작아질 때 -> m
				if (X - R < m) {
					exercise(time + 1, e_num, m);
				}
				// 휴식
				else
					exercise(time + 1, e_num, X - R);
			}
		}

	}
}