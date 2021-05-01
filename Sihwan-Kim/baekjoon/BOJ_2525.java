package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/2525">
 *      https://www.acmicpc.net/problem/2525 </a>
 */
public class BOJ_2525 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int startHour = Integer.parseInt(st.nextToken());
		int startMinute = Integer.parseInt(st.nextToken());
		int endMinute = Integer.parseInt(br.readLine());

		int sumTime = startMinute + endMinute;

		startHour += sumTime / 60;
		startMinute += endMinute - (60 * (sumTime / 60));
		if (startHour >= 24) {
			startHour -= 24;
		}
		System.out.println(startHour + " " + startMinute);
		br.close();
	}
}