package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/6996">
 *      https://www.acmicpc.net/problem/6996 </a>
 */
public class BOJ_6996 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int tc = Integer.parseInt(br.readLine());

		for (int i = 0; i < tc; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			isAnagram(st.nextToken(), st.nextToken());
		}
	}

	public static void isAnagram(String str1, String str2) {
		char[] charArray1 = str1.toCharArray();
		char[] charArray2 = str2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		if (Arrays.equals(charArray1, charArray2))
			System.out.println(str1 + " & " + str2 + " are anagrams.");
		else
			System.out.println(str1 + " & " + str2 + " are NOT anagrams.");

	}
}