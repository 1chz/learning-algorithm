package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @see <a href="https://www.acmicpc.net/problem/2562">
 *      https://www.acmicpc.net/problem/2562 </a>
 */
public class BOJ_2562 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 9; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}

		List<Integer> sortList = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		Integer maxInteger = sortList.get(0);
		int maxIntegerIndex = list.indexOf(maxInteger);
		System.out.println(maxInteger);
		System.out.println(maxIntegerIndex + 1);
	}
}