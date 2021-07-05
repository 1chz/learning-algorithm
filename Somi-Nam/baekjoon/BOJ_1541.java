package baekjoon;

import java.io.*;
import java.util.StringTokenizer;
/**
 * @see <a href="https://www.acmicpc.net/problem/1541">
 * https://www.acmicpc.net/problem/1541 ÀÒ¾î¹ö¸° °ýÈ£
 * </a>
 */
public class BOJ_1541 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String read = br.readLine();
		StringTokenizer token = new StringTokenizer(read, "-");
		br.close();
		
		if(token.countTokens() == 1) {
			System.out.println(getAllSum(read));
		} else {
			int first = getAllSum(token.nextToken());
			do {
				int sum = getAllSum(token.nextToken());	
				first = first - sum;
			} while (token.hasMoreTokens());
			System.out.println(first);
		}
	}
	private static int getAllSum(String read) {
		int sum = 0;
		if(read.contains("+")) {
			StringTokenizer token = new StringTokenizer(read, "+");
			do {
				sum += Integer.parseInt(token.nextToken());
			} while (token.hasMoreTokens());
		} else {
			sum = Integer.parseInt(read);
		}
		return sum;
	}
}
