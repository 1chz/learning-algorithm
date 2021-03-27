package baekjoon;

import java.util.Scanner;

/**
 * @author NSM
 * https://www.acmicpc.net/problem/11022
 */
public class Main_11022 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder builder = new StringBuilder();
		int cnt = sc.nextInt();
		for (int i = 0; i < cnt; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			builder.append(String.format("Case #%d: %d + %d = %d", i+1, a, b, a + b)).append("\n");
		}
		
		System.out.println(builder.toString());
	}
}
