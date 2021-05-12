package baekjoon;

import java.io.*;

/**
 * @see <a href="https://www.acmicpc.net/problem/11816">
 * https://www.acmicpc.net/problem/11816 8진수, 10진수, 16진수
 * </a>
 */
public class BOJ_11816 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String read = br.readLine();
		br.close();
		
		if(read.charAt(0) == '0') {
			if(read.charAt(1) == 'x') {
				// 16 진수
				System.out.println(Integer.parseInt(read.substring(2), 16));
			} else {
				// 8 진수
				System.out.println(Integer.parseInt(read.substring(1), 8));
			}
		} else {
			// 10진수
			System.out.println(read);
		}
	}
}
