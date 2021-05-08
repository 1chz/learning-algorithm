package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * @see <a href="https://www.acmicpc.net/problem/1076">
 *      https://www.acmicpc.net/problem/1076 </a>
 */
public class BOJ_1076 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Long answer = 0L;

		Map<String, Integer> map = new HashMap<>();
		map.put("black", 0);
		map.put("brown", 1);
		map.put("red", 2);
		map.put("orange", 3);
		map.put("yellow", 4);
		map.put("green", 5);
		map.put("blue", 6);
		map.put("violet", 7);
		map.put("grey", 8);
		map.put("white", 9);

		String temp = "";

		for (int i = 0; i < 3; i++) {
			String colorName = br.readLine();
			if (i == 2) {
				answer = (long) (Long.parseLong(temp) * Math.pow(10, map.get(colorName)));
			} else {
				temp += map.get(colorName);
			}
		}

		System.out.println(answer);

	}
}