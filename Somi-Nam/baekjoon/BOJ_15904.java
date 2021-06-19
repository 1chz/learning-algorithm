package baekjoon;

import java.io.*;
/**
 * @see <a href="https://www.acmicpc.net/problem/15904">
 * https://www.acmicpc.net/problem/15904 UCPC는 무엇의 약자일까?
 * </a>
 */
public class BOJ_15904 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String read = br.readLine();
		br.close();
		
		char[] ucpc = {'U', 'C', 'P', 'C'};
		int point = 0;
		
		for (int i = 0; i < read.length(); i++) {
			char c = read.charAt(i);
			if(c == ucpc[point]) point++;
			if(point == ucpc.length) break;
		}
		
		if(ucpc.length == point) {
			System.out.println("I love UCPC");
		} else System.out.println("I hate UCPC");
	}
}
