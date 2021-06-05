package BOJ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @see <a href="https://www.acmicpc.net/problem/1159">
 *      https://www.acmicpc.net/problem/1159 </a>
 */
public class BOJ_1159 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int max = Integer.parseInt(br.readLine());

		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < max; i++) {
			String readLine = br.readLine();
			String substring = readLine.substring(0, 1);
			if (map.containsKey(substring)) {
				Integer integer = map.get(substring);
				map.put(substring, integer + 1);
			} else {
				map.put(substring, 1);
			}
		}

		br.close();

		Set<Entry<String, Integer>> entrySet = map.entrySet();

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int i = 0;
		for (Entry<String, Integer> item : entrySet) {
			if (item.getValue() >= 5) {
				i++;
				bw.append(item.getKey());
			}
		}

		if (i > 0) {
			bw.flush();
		} else {
			bw.append("PREDAJA");
			bw.flush();
		}

		bw.close();
	}
}