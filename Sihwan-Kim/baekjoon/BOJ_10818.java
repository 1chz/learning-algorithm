package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/10818">
 *      https://www.acmicpc.net/problem/10818 </a>
 */
public class BOJ_10818 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int index = Integer.parseInt(br.readLine());
		List<Integer> list = new ArrayList<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < index; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}

		Collections.sort(list);

		System.out.println(list.get(0));
		System.out.println(list.get(index - 1));

	}
}