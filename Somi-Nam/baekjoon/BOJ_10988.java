package baekjoon;

import java.io.*;

/**
 * @see <a href="https://www.acmicpc.net/problem/10988">
 * https://www.acmicpc.net/problem/10988
 * </a>
 */
public class BOJ_10988 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String read = br.readLine();
		br.close();
		
		for (int i = 0; i < read.length() / 2; i++) {
			char front = read.charAt(i);
			char back = read.charAt(read.length() - i - 1);
			if(front == back) continue;
			else {
				System.out.println("0");
				return;
			}
		}
		System.out.println("1");
	}
}
