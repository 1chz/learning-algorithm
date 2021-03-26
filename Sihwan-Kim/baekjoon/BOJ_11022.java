package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/11022">
 * https://www.acmicpc.net/problem/11022
 * </a>
 */
public class BOJ_11022 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = Integer.parseInt(br.readLine());
		for (int i = 1; i < max + 1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int first = Integer.parseInt(st.nextToken());
			int last = Integer.parseInt(st.nextToken());
			int sum = first + last;
			System.out.println("Case #" + i + ": " + first + " + " + last + " = " + sum);
		}
	}

}
