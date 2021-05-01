package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

/**
 * @see <a href="https://www.acmicpc.net/problem/2908">
 * https://www.acmicpc.net/problem/2908 »ó¼ö
 * </a>
 */
public class BOJ_2908 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer token = new StringTokenizer(br.readLine(), " ");
		br.close();
		
		int a = Integer.parseInt(new StringBuilder(token.nextToken()).reverse().toString());
		int b = Integer.parseInt(new StringBuilder(token.nextToken()).reverse().toString());
		
		System.out.println(a > b? a : b);
	}
}
